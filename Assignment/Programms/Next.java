package com.op;
import java.util.Scanner;

class Ne {
	void getInput () {
		
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt(); //Taking the number of testcases
	    while(t-->0)
	    {
    		 int a =sc.nextInt() ; 
    		 sc.nextLine();
    	    String s =sc.nextLine();
    	    
    	  
    
    		System.out.println(a);
    		System.out.println(s);
	    }
	
	}
}
class Next{
	public static void main(String[] args) {
		Ne h=new Ne();
		h.getInput();
	}
}

