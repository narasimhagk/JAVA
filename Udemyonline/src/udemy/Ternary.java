package udemy;

public class Ternary {
    public static void main(String[] args) {
//        boolean b=false;
        int i=10;
        if(i == 10){
            System.out.println("False");
        }
        double d=20.00;
        double v=80.00;
        double total=d+v*100.00;
        System.out.println(total);
        double total1=total%40.00;
        System.out.println(total1);
        boolean x=total1 ==0 ? true:false;
        if(!x){
            System.out.println("got some remainder");
        }


    }
}
