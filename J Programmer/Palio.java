import java.util.Scanner;
class B{
	public static void main(String[] args){
		System.out.println("Enter a Something in words:");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String rev="";
		int strl=str.length();
		for(int i=strl-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("Yes");
		}
		else{
			System.out.println("no");
		}
	}
}