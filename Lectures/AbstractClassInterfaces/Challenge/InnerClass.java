package Lectures.AbstractClassInterfaces.Challenge;

import Lectures.LinkedList.Challenge.Song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InnerClass {

    /*
     *  Album class in LinkedList.Challenge modified
     */

    private LinkedList<Song> playlist = new LinkedList<>();
    private ArrayList<AlbumTwo> albums = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public void menu() {

        AlbumTwo _HybridTheory = new AlbumTwo("Linkin Park","Hybrid Theory");
        Song _InTheEnd = new Song("In The End", 3.45);
        Song _Papercut = new Song("Papercut", 4.32);
        Song _BreakingTheHabit = new Song("Breaking The Habit", 4.51);
        _HybridTheory.getSongList().add(_InTheEnd);
        _HybridTheory.getSongList().add(_BreakingTheHabit);
        _HybridTheory.getSongList().add(_Papercut);

        albums.add(_HybridTheory);



        // Concurrent modification error?

        ListIterator<Song> listIterator = playlist.listIterator();
        boolean forward = true;
        boolean quit = false;
        printMenu();
        while (!quit) {
//            listIterator = playlist.listIterator();
            int choice = getInput(0,9);
            // Clear scanner buffer
            scanner.nextLine();
            switch (choice) {
                case 0 -> printMenu();
                case 1 -> {
                    printAvailableSongs();
                    System.out.println("What song would you like to add?");
                    String songChoice = getInput();
                    addToPlaylist(songChoice);

                    printPlaylist();
                }
                case 2 -> {}
                case 3 -> {
                    if (!forward){
                        if (listIterator.hasNext())
                            listIterator.next();
                        forward = true;
                    }
                    if (listIterator.hasNext())
                        System.out.println(listIterator.next().toString());
                    else {
                        System.out.println("Sorry, that's the last song in the playlist");
                        forward = false;
                    }
                }
                case 4 -> {
                    if (forward) {
                        if (listIterator.hasPrevious())
                            listIterator.previous();
                        forward = false;
                    }
                    if (listIterator.hasPrevious())
                        System.out.println(listIterator.previous().toString());
                    else{
                        System.out.println("At the beginning of the playlist.");
                        forward = true;
                    }
                }
                case 5 -> {
                    System.out.println("What song would you like to remove? ");
                    removeSong(getInput());
                    printPlaylist();
                }
                case 6 -> printPlaylist();
                case 7 -> printAvailableSongs();
                case 8 -> quit = true;
            }

        }



    }

    private void printMenu() {
        String ls = System.lineSeparator();
        System.out.println("Playlist Menu"+ls+
                "0.Show Menu"+ls+
                "1.Add song to playlist"+ls+
                "2.Play/Pause"+ls+
                "3.Skip/Next song"+ls+
                "4.Previous song"+ls+
                "5.Remove song from playlist"+ls+
                "6.Show Playlist"+ls+
                "7.Show Available Songs"+ls+
                "8.Exit");
    }




    private void removeSong(String name) {
        playlist = playlist.stream()
                .filter(song -> !song.getTitle().equalsIgnoreCase(name))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private void addToPlaylist(String name, String album) {
        if (songAvailable(name)) {
            Song song = albums.stream()
                    .filter(album1 -> album.equalsIgnoreCase(album))
                    .findAny()
                    .orElse(null)
                    .getSong(name);

            if (song == null) {
                addToPlaylist(name);
            }
            playlist.add(song);
        }
        else
            System.out.println("No song with name: "+name+" in album: "+album+System.lineSeparator()+"Will search for songs with the same name...");
    }

    private void addToPlaylist(String name) {
        if (songAvailable(name)) {
            Song song = albums.stream()
                    .filter(album -> album.songExists(name))
                    .findAny()
                    .orElse(null)
                    .getSong(name);

            playlist.add(song);
        }
        else
            System.out.println("Sorry, so song available with the name: " + System.lineSeparator());
    }

    private boolean songAvailable(String name) {
        return albums.stream().anyMatch(album -> album.songExists(name));
    }

    private void printPlaylist() {
        System.out.println("==================");
        System.out.println("     Playlist     ");
        playlist.forEach(System.out::println);
        System.out.println("==================");
    }

    private void printAvailableSongs() {
        System.out.println("==================");
        System.out.println("     Available    ");
        albums.forEach(AlbumTwo::printSongList);
        System.out.println("==================");
    }

    private static boolean validChoice(int choice, int rangeFrom, int rangeTo) {
        if (choice >= rangeFrom && choice <= rangeTo)
            return true;
        System.out.println("Sorry, that's an invalid entry.");
        return false;
    }
    private static int getInput(int rangeFrom, int rangeTo) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (validChoice(choice, rangeFrom, rangeTo)) {
                    return choice;
                }
            }
            else
                scanner.next();
        }
    }
    private static String getInput() {
        String input;
        do {
            input = scanner.nextLine();
        } while (input.isBlank() || input.isEmpty());
        return input;
    }
}
/*
 *  Inner classes below for the modified and cleaner album class.
 *  combining with streams and new java features makes for easy to read
 *  concise practice.
 */
class AlbumTwo {
    private String artist;
    private String name;
    private SongList songs;

    public ArrayList<Song> getSongList() {
        return songs.getSongs();
    }

    public AlbumTwo(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.songs = new SongList();
    }

    public boolean addSong(Song song) {
        return (this.songs.add(song));
    }

    public Song getSong(String songName) {
        return songs.getSongs()
                .stream()
                .filter(song -> song.getTitle().equalsIgnoreCase(songName))
                .findAny()
                .orElse(null);
    }

    public boolean songExists(String songName) {
        return songs.getSongs()
                .stream()
                .anyMatch(song -> song.getTitle().equalsIgnoreCase(songName));
    }

    public void printSongList() {
        System.out.println(name + " by " + artist);
        this.songs.getSongs().forEach(System.out::println);
    }

    /*
     *
     *  Inner Class
     *
     */

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song))
                return false;

            this.songs.add(song);
            return true;
        }

        public ArrayList<Song> getSongs() {
            return this.songs;
        }


    }

}