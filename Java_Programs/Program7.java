public class Program7{
    static Program7 obj;
    Program7(){
        Program7.obj=this;
    }
    public static void main(String[] args){
        new Program7();
        System.out.println(Program7.obj);
    }
}