public class Program5{
    static int a;
    int b;
    static{
        a=100;
    }
    public static void main(String[] args) {
        Program5 obj=new Program5();
        System.out.println(a);
        System.out.println(obj.b);
    }
    Program5(){
        this.b=a;
    }
}