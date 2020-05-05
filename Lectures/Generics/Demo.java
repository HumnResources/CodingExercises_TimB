package Lectures.Generics;

import Lectures.Generics.Challenge.League;

public class Demo {
    /*
     *  Generics - Java 1.8+
     *
     *  Using paramatized type to specify list generic type.
     *  Diamond<>: Indicate a paramatized type.
     */

    public static void demo() {

        FootBallPlayer joe = new FootBallPlayer("joe");
        FootBallPlayer banks = new FootBallPlayer("Banks");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<BaseBallPlayer> chicagoClubs = new Team<>("Chicago Clubs");
        chicagoClubs.addPlayer(pat);

        Team<SoccerPlayer> teamGermany = new Team<>("Team Germany");
        teamGermany.addPlayer(beckham);

        Team<FootBallPlayer> melbourne = new Team<>("Melbourne");
        melbourne.addPlayer(banks);

        Team<FootBallPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootBallPlayer> fremantle = new Team<>("Fremantle");

        hawthorne.matchResult(fremantle, 1, 0);
        hawthorne.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2,1);
//        adelaideCrows.matchResult(chicagoClubs, 1, 2);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + " " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + " " + melbourne.ranking());
        System.out.println(hawthorne.getName() + " " + hawthorne.ranking());
        System.out.println(fremantle.getName() + " " + fremantle.ranking());

        System.out.println(adelaideCrows.compareTo(hawthorne));
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(hawthorne.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        League<Team<FootBallPlayer>> footballLeague = new League<>("Football League");
        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(hawthorne);
        footballLeague.addTeam(fremantle);
        footballLeague.addTeam(melbourne);

//        footballLeague.addTeam(teamGermany);

        System.out.println(footballLeague.toString());


//        Why not to use raw types, examples

        Team rawTypeTeam = new Team("Raw Team");
        rawTypeTeam.addPlayer(beckham);
        rawTypeTeam.addPlayer(joe);

        footballLeague.addTeam(rawTypeTeam);

        League<Team> rawLeague = new League<>("Raw League");
        rawLeague.addTeam(rawTypeTeam);
        rawLeague.addTeam(adelaideCrows);

        League reallyRawLeague = new League("Really Raw League");
        reallyRawLeague.addTeam(rawTypeTeam);
        reallyRawLeague.addTeam(adelaideCrows);

//      Errors above may not show until run time

    }
}
