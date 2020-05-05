package Lectures.Generics;

import java.util.ArrayList;

/*
 *  <T> - Type parameter. Add t o class to create generic.
 *
 *  <T extends R> - T is an extension of the class R.
 *      Tells java that the class will accept any class
 *      or subclass that extends R.
 *      T is bounded to R.
 *
 *  <T extends R & S...> - Syntax for extending multiple interfaces.
 */

// Team<(Generic Type) T extends (Class) Player> implements (Interface) Comparable<(Type) Team<(Generic Type)> >
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already on team: " + this.name);
            return false;
        }
        else {
            members.add(player);
            System.out.println(player.getName() + " was added to team: " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore)
            won++;
        else if (ourScore == theirScore)
            tied++;
        else
            lost++;

        played++;

        // Update the opponent score as well.
        if (opponent != null)
            opponent.matchResult(null, theirScore, ourScore);
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking())
            return -1;
        else if (this.ranking() < team.ranking())
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.ranking() + "pts";
    }
}
