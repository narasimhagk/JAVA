package udemy;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("lets go");
            int i=50/0;
            System.out.println(i);
        }
        catch(Exception e){
            throw new ArithmeticException("lol");
        }
        System.out.println("Mury Mury");
    }
}
