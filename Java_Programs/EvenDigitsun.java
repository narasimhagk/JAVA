public class EvenDigitsun {
    public static int evenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        for(int i=number;i>0;i=i/10){
            int lastDigit=i%10;
            if(lastDigit%2==0){
                sum+=lastDigit;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(evenDigitSum(135780));
    }
    
}
