public class Sumand5challenge{
    public static void main(String[] args){
        int count=0;
        int matches=0;
        for(int i=0;i<1000;i++){
            if(i%3==0&&i%5==0){
                count++;
                matches+=i;
                System.out.println("Matches = "+i);
            }
            if(count==5){
                break;
            }
        }
        System.out.println("Total = "+matches);
    }
}