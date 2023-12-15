import java.util.*;
class Temperature{
	static Scanner s=new Scanner(System.in);
	static double c_f(double c){
		double f=(c*9/5)+32;
		return f;
	}
	static double c_k(double c){
		double k=c+273.15;
		return k;
	}
	static double f_c(double f){
		double c=(f-32)*5/9;
		return c;
	}
	static double f_k(double f){
		double k=(f-32)*5/9+273.15;
		return k;
	}
	static double k_c(double k){
		double c=k-273.15;
		return c;
	}
	static double k_f(double k){
		double f=(k-273.15)*9/5+32;
		return f;
	}
	 static double input(String word){
    System.out.println("Enter "+word+" value:");
      double val = s.nextDouble();
    return val;
  }
	 static void output(double val, String word){
    System.out.printf("%s value: %.2f",word,val);
  }
	public static void main(String[] args){
		 System.out.println("1. Celcius to Fahrenheit\n2. Celcius to Kelvin\n"+
              "3. Fahrenheit to Celcius\n4. Fahrenheit to Kelvin\n"+
              "5. Kelvin to Celcius\n6. Kelvin to Fahrenheit\n7. Exit");
		do{
			System.out.println("\n Enter Your Choice:");
			int ch=s.nextInt();
			double num=0;
			switch(ch){
				case 1:num=input("°c");
				output(c_f(num),"°f");
				break;
				case 2:num=input("°c");
				output(c_k(num),"°k");
				break;
				case 3:num=input("°f");
				output(f_c(num),"°c");
				break;
				case 4:num=input("°f");
				output(f_k(num),"°k");
				break;
				case 5:num=input("°k");
				output(k_c(num),"°c");
				break;
				case 6:num=input("°k");
				output(k_f(num),"°f");
				break;
				case 7: 
				default: System.out.println("Invalid Input");
				System.exit(0);
				break;
			}
		}while(true);
	}
}