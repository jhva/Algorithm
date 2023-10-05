package org.example.dp;

import java.util.Scanner;

public class 타일링2xn_2_11727 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;

        }
        System.out.println(dp[N]);
    }
}


/**
 * 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * <p>
 * 아래 그림은 2×17 직사각형을 채운 한가지 예이다.
 */