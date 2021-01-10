public class determineWinner {
    int wins = 0;
    int loss = 0;
    int tie = 0;

    //Method to determine who wins/loses
    public String findWinner(String playerC, String oChoice) {
        if (playerC.equals(oChoice)) {
            tie++;
            return "It's a tie";
        } else if (playerC.equals("rock") && oChoice.equals("scissors") || playerC.equals("paper") && oChoice.equals("rock") || playerC.equals("scissors") && oChoice.equals("paper")) {
            wins++;
            return "You Win!";
        } else {
            loss++;
            return "You lose :(";
        }
    }

}
