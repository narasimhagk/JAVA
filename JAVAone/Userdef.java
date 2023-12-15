// import java.util.Scanner;
class Userdef{		
	int x=11;
	public static void main(String[] args){
		Userdef u=new Userdef();
		evOd(u.x);	
	}
	public static void evOd(int n){
		if(n%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
}