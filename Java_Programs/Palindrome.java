public class Palindrome {
    public static boolean isPalindrome(int number){
        int rev=0;
        while(number!=0){
            int lastDigit=number%10;
            rev=rev*10+lastDigit;
            number=number/10;
            System.out.println(number);
        }
        return number==rev;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
