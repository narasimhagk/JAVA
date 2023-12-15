import java.util.*;
class Calcu{
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter two numbers:");
		double first =read.nextDouble();
		double second =read.nextDouble();
		System.out.print("Enter the operator:");
		char operator=read.next().charAt(1);
		double result;
		switch(operator){
			case '+':
			result=first+second;
			break;
			case '-':
			result=first-second;
			break;
			case '*':
			result=first*second;
			break;
			case '/':
			result=first/second;
			break;
			default:
			System.out.println("Invalid Operator");
			return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);

	}
}