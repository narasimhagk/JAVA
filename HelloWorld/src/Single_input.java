import java.util.ArrayList;
import java.util.Scanner;

public class Single_input {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();

        if(number>1&&number%2==0){
            number--;
        }
        ArrayList<Integer> list_of_numbers=new ArrayList<>();
        int count=1;
        for(int i=1;i<=number;i++){
            list_of_numbers.add(count);
            count+=2;
        }
        for(int num:list_of_numbers){
            System.out.println(num+" ");
        }
        System.out.println();
    }
}