public class ForLoop{
    public static void main(String[] args){
        // System.err.println(isPrimeNumber(17)    );
        int count=0;
        for(int i=10;i<=50;i++){
            if(isPrimeNumber(i)){
                System.out.println("number "+i+" is a prime number");
                count++;
                if(count==3){
                System.out.println("Found -3 - exiting loop");
                break;
            }
            }
            
        }
        System.out.println("Total Number of prime numbers between 10 and 50 is "+count);
    }
    public static boolean isPrimeNumber(int num){
        // for(int num1=2;num1<=num;num1++){
        //     if(num1%2==0){
        //         System.out.println(num1+" is not a prime number");
        //     }else{
        //         System.out.println(num1+" is a prime number");
        //     }
        // }
        if(num<=2){
            return (num==2);
        }
        for(int divisor=2;divisor<num;divisor++){
            if(num%divisor==0){
                return false;
            }
        }
        return true;
    }
}