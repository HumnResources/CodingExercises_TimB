package Lectures.LinkedList.Challenge;

import java.util.ArrayList;

public class Album {
    private String artist;
    private String name;
    private ArrayList<Song> songList = new ArrayList<Song>();
    private SongList songs;

    public ArrayList<Song> getSongList() { return songList; }

    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
    }

    public boolean addSong(Song song) {
        return (this.songs.add(song));
    }

    public Song getSong(String songName) {
        return songList.stream()
                .filter(song -> song.getTitle().equalsIgnoreCase(songName))
                .findAny()
                .orElse(null);
    }

    public boolean songExists(String songName) {
        return songList.stream().anyMatch(song -> song.getTitle().equalsIgnoreCase(songName));
    }

    public void printSongList() {
        System.out.println(name + " by " + artist);
        this.songList.forEach(System.out::println);
    }


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



    }

}
