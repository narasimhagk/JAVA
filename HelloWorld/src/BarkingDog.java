public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hoursOfDay){
        if(hoursOfDay<0||hoursOfDay>23){
            return false;
        }
        if(barking&&(hoursOfDay<8||hoursOfDay>22)){
            return true;
        }
            return false;

    }

    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        boolean barking=s.nextBoolean();
//        int hoursOfDay=s.nextInt();
        System.out.println(shouldWakeUp(true,9));
        System.out.println(shouldWakeUp(true, 6));  // true
        System.out.println(shouldWakeUp(false, 6)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, 23)); // true
        System.out.println(shouldWakeUp(true, -1)); // false
        System.out.println(shouldWakeUp(true, 24)); // false

    }
}
