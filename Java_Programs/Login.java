public class Login {
    static{
        System.out.println("Login page is loading....");
    }
    public static void main(String[] args){
        System.out.println("Communication starts");
        Inbox.mailInfo();
    }
    
}
class Inbox{
    static{
        System.out.println("Inbox page is loading...");
    }
    static void mainInfo(){
        System.out.println("Recent mail info...");
    }
}
