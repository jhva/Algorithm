package org.example.two_dimensional_array;

import java.util.Scanner;

public class baekjoon_쉬운계단수10844 {
    static Scanner sc = new Scanner(System.in);
    static int[] dp = new int[101];

    public static void main(String[] args) {
        int N = sc.nextInt();

//
//        dp[1] = 9;
//        dp[2] = 17;

        for (int i = 3; i <= N; i++) {
            dp[i] = (2 * (dp[i - 1])) - 1 % 1000000000;

        }
        System.out.println(dp[N]);

    }


}
