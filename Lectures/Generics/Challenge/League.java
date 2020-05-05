package Lectures.Generics.Challenge;


import Lectures.Generics.Team;
import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>  {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        return league.add(team);
    }

    @Override
    public String toString() {
        StringBuilder leagueTable = new StringBuilder(this.name).append(System.lineSeparator());
        Collections.sort(league);
        for (T team: league) {
            leagueTable.append(team.toString()).append(System.lineSeparator());
        }
        return leagueTable.toString();
    }
}
