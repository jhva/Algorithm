package org.example.dp;

import java.util.Scanner;

public class baekjoon_1463 {
//    static Scanner sc = new Scanner(System.in);
//    static int cnt = 0;
//    static int dp[];
//
//    public static void main(String[] args) {
//        int N = sc.nextInt();
//        dp = new int[N + 1]; //1대문에
//
//        dp[1] = 0;
//        for (int i = 2; i < N + 1; i++) {
//            dp[i] = dp[i - 1] + 1;
//
//            if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
//                dp[i] = dp[i / 2] + 1;
//            }
//            if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
//                dp[i] = dp[i / 3] + 1;
//            }
//        }
//        System.out.println(dp[N]);
//    }

    static int N;
    static int dp[];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        N = sc.nextInt();
        dp = new int[N + 1];
        dp[0] = dp[1] = 0;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp[N]);
    }


}

/**
 * 만약 n= 2,3 이 1이되는 경우는 무조건 경우의 수는 1이다
 * 여기서 수식으로 바꾸면 dp[3을 1로 만드는 최소횟수] =1 dp[2를 1로만드는 횟수]+1
 * 4일경우는
 * <p>
 * 0.15초
 * <p>
 * x 가 3으로 나누어 떨어지면 3으로 나눔
 * x 가 2로 나누어 떨어지면 2로 나눔
 * 1을 뺀다
 * <p>
 * <p>
 * N이 주어졌을대
 * 위 3가지 연산을 사용하여서 1을 만들려고함 연산을 사용하는 횟수의 최솟값을구해라
 * <p>
 * 0.15초
 * <p>
 * x 가 3으로 나누어 떨어지면 3으로 나눔
 * x 가 2로 나누어 떨어지면 2로 나눔
 * 1을 뺀다
 * <p>
 * <p>
 * N이 주어졌을대
 * 위 3가지 연산을 사용하여서 1을 만들려고함 연산을 사용하는 횟수의 최솟값을구해라
 */


/**
 * 0.15초
 * <p>
 * x 가 3으로 나누어 떨어지면 3으로 나눔
 * x 가 2로 나누어 떨어지면 2로 나눔
 * 1을 뺀다
 * <p>
 * <p>
 * N이 주어졌을대
 * 위 3가지 연산을 사용하여서 1을 만들려고함 연산을 사용하는 횟수의 최솟값을구해라
 */