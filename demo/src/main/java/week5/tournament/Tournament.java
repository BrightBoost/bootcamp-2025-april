package week5.tournament;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String name;
    private List<Team> teams; // we can only have tournaments with a nr of teams thats is 2ˆn
    private Team winner;

    public Tournament(String name, List<Team> teams) {
        this.name = name;
        this.teams = teams;
    }


    public void startTournament() {
        while(winner == null) {
            Round r = createRound(teams);
            teams = r.playRound();
            if(teams.size() == 1) {
                winner = teams.getFirst();
            }
        }
        System.out.println("🏆 The winner of the tournament is: " + winner.getName());
    }

    public Round createRound(List<Team> teams) {
        List<Match> matches = new ArrayList<>();
        // create matches
        for(int i = 0; i < teams.size(); i = i + 2) {
            Match match = new Match(teams.get(i), teams.get(i + 1));
            matches.add(match);
        }
        // add them to the round
        return new Round(matches);
    }
}
