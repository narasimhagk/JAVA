package udemy;

@SuppressWarnings("ALL")
public class Two {
    public static void main(String[] args) {
        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;
        int finalScore=score;
        if(gameOver){
            finalScore+=(levelCompleted*bonus);
            System.out.println("you final score was:"+finalScore);
        }
        boolean newGameOver=true;
        int newScore=10000;
        int newLevelCompleted=8;
        int newBonus=200;
        int newFinalScore=newScore;
        if(newGameOver){
            newFinalScore+=(newLevelCompleted*newBonus);
            System.out.println("your new Final Score:"+newFinalScore);
        }


    }
}
