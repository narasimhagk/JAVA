import java.util.Scanner;

public class MethodChallange {
    public static void  displayPosition(String name,int playerPosition){
        System.out.println(name+" mananged to get into position "+playerPosition+" on the high score List");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }
        else if(playerScore>=500 && playerScore<1000){
            return 2;
        }
        else if(playerScore>=100 && playerScore<500){
            return 3;
        }
        else{
            return 4;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String u=s.next();
        int score=calculateHighScorePosition(s.nextInt());
        displayPosition(u,score);

    }
}
