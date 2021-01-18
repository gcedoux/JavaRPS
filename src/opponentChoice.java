public class opponentChoice {

    //Method to get the opponents choice
    public static String opponentC(){
        int random = (int) (Math.random() * 3);

        if (random == 1){
            return "rock";
        } else if (random == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }




}
