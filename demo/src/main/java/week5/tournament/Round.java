package week5.tournament;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Match> matches;
    List<Team> roundWinners = new ArrayList<>();

    public Round(List<Match> matches) {
        this.matches = matches;
    }

    public Round() {

    }

    public List<Team> playRound() {
        System.out.println("=== Starting Round ===");
        for(Match match : matches) {
            roundWinners.add(match.play());
        }
        System.out.println("=== Round complete ===");
        return roundWinners;
    }

}
