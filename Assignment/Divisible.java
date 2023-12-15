import java.util.Scanner;
class D{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=s.nextInt();
		if(a%7==0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}