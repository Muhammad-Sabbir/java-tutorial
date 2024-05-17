public class MechodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Tim", calculateHighScorePosition(1000));
        displayHighScorePosition("Tim", calculateHighScorePosition(500));
        displayHighScorePosition("Tim", calculateHighScorePosition(100));
        displayHighScorePosition("Tim", calculateHighScorePosition(25));

    }
    public static void displayHighScorePosition(String name, int position){
        System.out.print(name + " managed to get into position "+position+" on the high score list \n");
    }
    
    public static int calculateHighScorePosition(double score){
        if(score>= 1000){
            return 1;
        } else if (score>= 500 && score < 1000) {
            return 2;
        } else if (score>= 100 && score < 500) {
            return 3;
        } else{
            return 4;
        }
    }
}
