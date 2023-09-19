// import java.io.*;
import java.util.Scanner;
class Range{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num1=s.nextInt();
	//\u000d System.out.println("--------");
	System.out.println("Enter Another Number:");
	int num2=s.nextInt();
	//\u000d System.out.println("--------");
	System.out.println("Prime Numbers are:");
	for(int i=num1;i<=num2;i++){
		// int n=i;   
		int a=2;   
		int temp=0;  
		while(a<=(i/2)){
			if(i%a==0){
				temp++;
				break;
			}
			a++;     
		}
		if(temp==0){
			System.out.println(i+" is a Prime Number ");
		}
	}
	}
}