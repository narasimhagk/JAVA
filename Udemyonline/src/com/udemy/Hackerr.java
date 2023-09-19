package com.udemy;

import java.util.Scanner;

public class Hackerr{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String d=s.next();
            int x=s.nextInt();
            System.out.printf("%-15s%03d%n",d,x);
        }
        System.out.println("================================");
    }
}
