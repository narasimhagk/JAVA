public class Program4{
    static Some classType2;
    static {
        classType2=new Some();
        System.out.println("Something"+classType2);
    }
   
    public static void main(String[] args){
        System.out.println("Main Method");              
        Some n=new Some();
        n.variv();

    }
    static class Some{
        static int someValue=42;
        public Some(){
            System.out.println("inside constructor "+Program4.classType2);
        }
        public void variv(){
            System.out.println("when life makes you single.....be Ram, not Arjun Reddy");
        }
    }
}