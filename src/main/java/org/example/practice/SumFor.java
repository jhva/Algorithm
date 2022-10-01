package org.example.practice;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.println("직각이등변삼각형");
            n = stdIn.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) { // 행
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
