package week5.tournament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // sorry but skipping players
        // let's create 8 teams
        Team team1 = new Team("team1");
        Team team2 = new Team("team2");
        Team team3 = new Team("team3");
        Team team4 = new Team("team4");
        Team team5 = new Team("team5");
        Team team6 = new Team("team6");
        Team team7 = new Team("team7");
        Team team8 = new Team("team8");

        List<Team> theTeams = new ArrayList<>(Arrays.asList(team1, team2, team3, team4, team5, team6, team7, team8));
        Tournament tournament = new Tournament("Big Game", theTeams);
        tournament.startTournament();

    }
}
