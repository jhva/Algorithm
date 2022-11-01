package org.example;

import java.util.Scanner;

public class 피보나치수5_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(recurison(N));
    }

    public static int recurison(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return recurison(n - 1) + recurison(n - 2);

    }
}
