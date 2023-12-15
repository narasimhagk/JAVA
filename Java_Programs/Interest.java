public class Interest {
    public static void main(String[] args) {
        for(double rate=0.00;rate<=5.00;rate++){
            double interestAmount=getDiscount(1000, rate);
            System.out.println(interestAmount);
        }
        for(double i=7.5;i<10.00;i+=0.25){
            
            double amt=getDiscount(100.00,i);
            if(amt>8.5){
                break;
            }
            System.out.println("new"+amt);

        }
    }
    public static double getDiscount(double amount,double rate){
        return (amount*(rate/100));
    }
    
}
