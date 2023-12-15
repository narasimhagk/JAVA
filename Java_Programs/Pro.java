public class Pro{
    public static void main(String[] args){
        System.out.println(fun());
    }
    static int a;
    static int fun(){
        a=50;
        a=a+fun1();
        return a;
    }
    static int fun1(){
        System.out.println("ko");
        return 100;
    }
}