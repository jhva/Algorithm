package org.example.baekjoon;

import java.util.Scanner;

public class 별찍기_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");

            }
            System.out.println("*");

        }

    }
}
