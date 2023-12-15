package com.lis;

import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();  // Read a
            int b = scanner.nextInt();  // Read b
            int n = scanner.nextInt();  // Read n

            // Generate the series for the current query
            int term = a;
            for (int j = 0; j < n; j++) {
                term += (int) Math.pow(2, j) * b;
                System.out.print(term + " ");
            }
            System.out.println();  // Print a new line after each query's series
        }

        scanner.close();
    }
}

