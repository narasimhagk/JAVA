import java.util.Scanner;
class Fiba{
	static int n1=0,n2=1,n3=0;
	static void m(int count){
		if(count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			m(count-1);
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int count=s.nextInt();
		System.out.print(n1+" "+n2);
		m(count-2);
	}
}