class Leap{
	public static void main(String[] args){
		int x=2021;
		/*  if(x%4==0){
			System.out.println(x+" Is a leap year");
		}
		else if(x%400==0 && x%100!=0){
			System.out.println(x+" Is leap year");
		}
		else{
			System.out.println(x+" Is not a leap Year");
		} */
		// Using || operator
		/* if(x%4==0 || (x%400==0 && x%100!=0)){
			System.out.println(x+" Is a leap year");
		}
		else{
			System.out.println(x+" Is not a leap year");
		} */
		// Using Ternary Operator
		 String t=(x%400==0)||(x%4==0 && x%100!=0)?"YES":"NO";
		if(t=="YES"){
			System.out.println(x+" Is a leap year");
		}else{
			System.out.println(x+" Is not a leap year");
		} 
		boolean b;
		/* if(x%4==0){
			b=true;
			System.out.println(x+" Is leap year");
		}
		else if(x%400==0 && x%100!=0){
			b=false;
			System.out.println(x+" Is leap year");
		}
		else{
			System.out.println(x+" Is not a leap year");
		} */
	}
}