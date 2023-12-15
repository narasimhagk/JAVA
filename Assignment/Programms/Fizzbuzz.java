package com.programm;
import  java.util.*;

public class Fizzbuzz {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=s.nextInt();
		System.out.print("The Fizz,Buzz and FizzBizz numbers are:");
		for(int i=1;i<n;i++){
			if(i%3==0&&i%5==0) {
				System.out.print("Fizz Buzz");
			}
			else if(i%3==0) {
				System.out.print("Fizz");
			}
			else if(i%5==0) {
				System.out.print("Buzz");
			}
			else {
				System.out.print(i);
			}
			System.out.print(","+"");
		}
		s.close();
	}

}
