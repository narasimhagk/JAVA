public class EvenNumber {
    public static boolean isEvenNumber(int num){
        if(num%2==0){
            return true;
        } else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int number=4;
        int last=32;
        int evenCount=0;
        int oddCount=0;
        while(number<=last){
            number++;
            if(!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            System.out.println("Even Number "+number);
            evenCount++;
            if(evenCount>=5){
                break;
            }
        }
        System.out.println("Total Even Numbers "+evenCount);
        System.out.println("Total Odd Numbers "+oddCount);
    }
}

