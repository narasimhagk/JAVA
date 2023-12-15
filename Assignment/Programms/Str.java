package com.op;
import java.util.Scanner;

class Sol{
	static String toLo(String s) {
		String c=s.toLowerCase();
		return c;
	}
}
public class Str {
	public static  void main(String[] args) {
		Sol n=new Sol();
		System.out.println(n.toLo("ABCDE"));
	}
}
