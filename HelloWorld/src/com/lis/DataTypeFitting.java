package com.lis;

import java.util.Scanner;

public class DataTypeFitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            long n = scanner.nextLong();  // Read the input number
            System.out.println(n+" can be fitted in :");

            // Check the data type that can store the input number
            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println(n + " can be fitted in byte");
            }
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                System.out.println(n + " can be fitted in short");
            }
            if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                System.out.println(n + " can be fitted in int");
            }
            if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                System.out.println(n + " can be fitted in long");
            }
            if (n < Byte.MIN_VALUE || n > Long.MAX_VALUE) {
                System.out.println(n + " can't be fitted anywhere");
            }
        }

        scanner.close();
    }
}

