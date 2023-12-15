public class KilotoMega {
    public static void printlConversion(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes=kiloBytes/1024;
            int remainKiloBytes=kiloBytes%1024;
            System.out.println(kiloBytes+"KB ="+megaBytes+"MB and "+remainKiloBytes+"KB");
        }
    }
    public static void main(String[] args) {
        printlConversion(10392);

    }
}
