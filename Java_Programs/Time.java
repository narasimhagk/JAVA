public class Time {
    public static String getDuratioString(int seconds){
        
        if(seconds<0){
            return "Invalid data for seconds("+seconds+"), must be postive integer";
        }else{
            int minutes=seconds/60;
            return getDuratioString(minutes, seconds);
        }
        // int hours=minutes/60;
        // System.out.println("hours = "+hours);

        // // one step approach

        // // int hours1=seconds/3600;
        // // System.out.println("hours = "+hours1);
        // // return "";
        // int remainingMinutes=minutes%60;
        // System.out.println("minutes = "+minutes);
        // System.out.println("remainingMinutes = "+remainingMinutes);

        // int remainingSeconds=seconds%60;
        // System.out.println("seconds = "+seconds);
        // System.out.println("remainingSeconds = "+remainingSeconds);
        // return hours+" h "+remainingMinutes+" m "+remainingSeconds+" s ";

        
    }
    public static String getDuratioString(int minutes,int seconds){
        if(minutes<0 || seconds<0){
            return "Invalid data for minutes("+minutes+") and second ("+seconds+"), must be postive integer";
        }
        if(seconds<=0||seconds>=59){
            return "Invalid data for seconds ("+seconds+"), must be between 0 and 59";
        }
         
        int hours=minutes/60;
        

        // one step approach

        // int hours1=seconds/3600;
        // System.out.println("hours = "+hours1);
        // return "";
        int remainingMinutes=minutes%60;
       

        int remainingSeconds=seconds%60;
       
        return hours+" h "+remainingMinutes+" m "+remainingSeconds+" s ";
       
    }
    public static void main(String[] args){
        System.out.println(getDuratioString(3600));
        System.out.println(getDuratioString(165,45));
        System.out.println(getDuratioString(65,-45));
    }
}
