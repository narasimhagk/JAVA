public class Program1{
    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Non Static Block");
    }

    public static void main(String[] args){
        System.out.println("Main Method Start");

        Program1 pro=new Program1();
        System.out.println("End of Main Method");
    }
    Program1(){
        System.out.println("Constructor");
    }
}