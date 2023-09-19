package com.java;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] x= {{10,20,30},{40,50,60}};
		for(int i=0;i<x.length;i++) {
			for(int u=0;u<x[i].length;u++) {
				System.out.println(x[i][u]+" ");
			}
		}
	}
}
