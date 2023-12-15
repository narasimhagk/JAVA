import java.util.Scanner;
class Three{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Value:");
		int n=s.nextInt();
		if(n>99 && n<1000){
			System.out.println("Three Digit number");
		}
		else{
			System.out.println("No");
		}
	}
}