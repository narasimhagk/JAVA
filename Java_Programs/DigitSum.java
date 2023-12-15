public class DigitSum{
    public static void main(String[] args){
        System.out.println(sumDigit(8));
        System.out.println(sumDigit(-1890));
    }
    public static int sumDigit(int number){
        if(number>0){
            int sum=0;
            while(number>9){
                sum=sum+(number%10);
                number=number/10;
               System.out.println(sum);
            }
            sum+=number;
             return sum;
            
        }else{
            return -1;
        }
    }
}