package com.list;

public class ForEach {
	public static void main(String[] args) {
		int num[]= {10,20,30,40,50};
		for(int x:num) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.println("\n");
		String name[]= {"Stay", "with", "me"};
		for(String mit:name) {
			System.out.print(mit);
			System.out.print(" ");
		}
	}

}
