import java.util.Scanner;
class Pos{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		int num=s.nextInt();
		if(num>0){
			System.out.println("Positive");
		}
		else if(num==0){
			System.out.println("Zero");
		}
		else{
			System.out.println("No");
		}
	}
}