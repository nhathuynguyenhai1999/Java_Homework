package James_Module2;

public class TennisGame {
    private static final int WINNING_SCORE = 4;

    public String getScore(int player1Points, int player2Points) {
        if (isGameWon(player1Points, player2Points)) {
            return getWinningPlayerName(player1Points, player2Points) + " wins";
        }

        if (isGameInDeuce(player1Points, player2Points)) {
            return "Deuce";
        }
        if (isGameWon(player1Points, player2Points)) {
            return getWinningPlayerName(player1Points, player2Points) + " wins";
        }

        if (isGameInDeuce(player1Points, player2Points)) {
            return "Deuce";
        }

        if (isAdvantage(player1Points, player2Points)) {
            return getAdvantagePlayerName(player1Points, player2Points) + " has advantage";
        }

        if (isGameInTieBreak(player1Points, player2Points)) {
            return "Tiebreak";
        }
        // Add other scoring conditions and logic here...

        return "Current score";
    }

    private boolean isGameInTieBreak(int player1Points, int player2Points) {
        return isScoreGreaterThanWinning(player1Points) && isScoreGreaterThanWinning(player2Points)
                && Math.abs(player1Points - player2Points) == 1;
    }

    private String getAdvantagePlayerName(int player1Points, int player2Points) {
        return (player1Points > player2Points) ? "Player 1" : "Player 2";
    }


    private boolean isAdvantage(int player1Points, int player2Points) {
        return isScoreGreaterThanWinning(player1Points) && isScoreGreaterThanWinning(player2Points)
                && Math.abs(player1Points - player2Points) == 1;
    }

    private boolean isGameWon(int player1Points, int player2Points) {
        return isScoreGreaterThanWinning(player1Points) || isScoreGreaterThanWinning(player2Points)
                && Math.abs(player1Points - player2Points) >= 2;
    }

    private boolean isScoreGreaterThanWinning(int score) {
        return score >= WINNING_SCORE;
    }

    private String getWinningPlayerName(int player1Points, int player2Points) {
        return (player1Points > player2Points) ? "Player 1" : "Player 2";
    }

    private boolean isGameInDeuce(int player1Points, int player2Points) {
        return isScoreAtLeast(player1Points) && isScoreAtLeast(player2Points)
                && player1Points == player2Points;
    }

    private boolean isScoreAtLeast(int playerPoints) {
        return playerPoints >= 3;
    }
    public static void main(String[] args){
        TennisGame tennisGame = new TennisGame();
        
        int player1Points = 3;
        int player2Points = 3;

        String currentScore = tennisGame.getScore(player1Points, player2Points);
        System.out.println("Current Score: " + currentScore);
    }
}

