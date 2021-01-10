import java.util.Scanner;

public class rps {

    public static void main(String[] args) {
       determineWinner result = new determineWinner();
       OpponentChoice oppChoice = new OpponentChoice();
       int i = 0;

       do {
           Scanner input = new Scanner(System.in); //Created scanner to accept user input
           System.out.println("Hello, choose rock, paper or scissors: type 'quit' to quit");
           String playerC = input.nextLine().toLowerCase();//Store the value for user input

           if (playerC.equals("quit")) {
               break;
           }else if (!playerC.equals("rock") && !playerC.equals("scissors") && !playerC.equals("paper")){
               System.out.println("Invalid input! try again!");
           }else {
               System.out.println("You chose: " + playerC);
               System.out.println("Opponent chose: " + oppChoice.opponentC());
               System.out.println(result.findWinner(playerC, oppChoice.opponentC()) + "\n");
           }

       } while (true);
               System.out.println("Thank you for playing! \nWins: " + result.wins + ". \nLosses: " + result.loss + ". \nTies: " + result.tie + "." );
    }
}
