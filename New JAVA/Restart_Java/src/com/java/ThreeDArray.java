package com.java;

public class ThreeDArray {
	public static void main(String[] args) {
		int[][][] x={ {{10,20,30},{40,50,60}},{{70,80,90},{100,110,120},{130,140,150}}};
		for(int i=0;i<x.length;i++) {
			for(int u=0;u<x[i].length;u++) {
				for(int p=0;p<x[i][u].length;p++) {
					System.out.print(x[i][u][p]+" ");
				}
			}
		
		}
	}
	
}
