import java.util.*;

public class One{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("================================");
        
        while(sc.hasNext()){
            String hi=sc.next();
            int num=sc.nextInt();
            
            System.out.printf("%-15s%03d%n",hi,num);
        }
        System.out.println("================================");
        sc.close();
    }
}