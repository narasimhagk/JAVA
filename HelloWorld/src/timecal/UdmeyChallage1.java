package timecal;

public class UdmeyChallage1 {
    public static String getDurationtoString(int seconds){
        int minutes=seconds/60;


        return getDurationtoString(minutes,seconds);
    }
    public static String getDurationtoString(int minutes,int seconds){
        int hours=minutes/60;
        int remaingMinutes=minutes%60;
        int remaingSeconds=seconds%60;
        return hours+"h"+remaingMinutes+"m"+remaingSeconds+"s";
    }
    public static void main(String[] args) {
        System.out.println(getDurationtoString(3600));
        System.out.println(getDurationtoString(65,48));
    }
}
