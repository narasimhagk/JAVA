import java.util.*;
import java.util.Scanner;
import java.lang.Math;
class C1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int y=s.nextInt();
		int result=0;

		switch(i){
			case 1:
			result=i*i+y*y;
			break;
			case 2:
			result=i*i*i+y*y*y;
			break;
			default:
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println(result);
		
		
	}
}