public class Program3{
    int a;
    {
        this.a=100;
        System.out.println(a);
    }
    Program3(){
        this.a=200;
        System.out.println(a);
    }
    
    public static void main(String[] args){
        new Program3();
    }
}