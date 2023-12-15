public class Program{
    static int a=100;
    static{
        System.out.println(a);
    }

    public static void main(String[] args){
        System.out.println(a);
    }
    static{
        a=200;
    }
}