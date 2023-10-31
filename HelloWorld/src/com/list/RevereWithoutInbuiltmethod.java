package com.list;

import java.util.Scanner;

public class RevereWithoutInbuiltmethod {
	public static void main(String[] args) {
		String str="Spring Tool";
		char store[]=str.toCharArray();
		for(int i=store.length-1;i>=0;i--) {
			System.out.print(store[i]);
			System.out.printf(" ");
		}
		//Method - 2
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String:");
		String sr=scan.nextLine();
		//used split method to print in reverse order
		String t[]=sr.split(" ");
		for(int i=t.length-1;i>=0;i--) {
			System.out.println(t[i]);
		}
	}

}
