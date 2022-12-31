package org.example.dp;

import java.util.Scanner;

public class 타일링2xn_11726 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int N = sc.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        //9
        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        System.out.println(dp[N]);
//1(1) -> 2(2) -> 3(3) -> 4(5) -> 5(8)

    }
}


/**
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 */