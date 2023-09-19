package udemy;

public class Ernaryi {
    public static void main(String[] args) {
        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;
        int finalScore=score;
//        if(score <500 && score>1000){
//            System.out.println("your score was less than 5000 but greater than 1000");
//        }
//        else if(score<1000){
//            System.out.println("Your score was less than 1000");
//        }
//        else{
//            System.out.println("Got here");
//        }
        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            System.out.println("your final Score:"+finalScore);
        }
//        boolean newGameOver=true;
//        int newScore=10000;
//        int newLevelCompleted=8;
//        int newBonus=200;
//        int newFinalScore=newScore;
//        if(newGameOver){
//            newFinalScore+=newScore;
//            System.out.println("Your new Score:"+newFinalScore);
//        }
        score=10000;
        levelCompleted=8;
        bonus=200;
        finalScore=score;
        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            System.out.println("your score:"+finalScore);
        }

    }
}
