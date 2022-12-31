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
 * 4일 경우는
 *
 * 그렇다면 4의 경우는 어떨까?
 * d[4를 1로 만드는 최소 횟수] =
 *   (1) N-1을 하면 N=3이 되고, 다시 N/3을 하면 1이 된다. => 2번
 *   (2) N/2를 하면 N=2가 되고, 다시 N/2나 N-1을 하면 1이 된다. => 2번
 *   (3) N/3의 경우는 불가능하다.
 * 결국 이 경우의 수 중에서 제일 작은 값인 2번이 된다.
 *
 * 즉 N을 최소 횟수로 1로 만드는 과정은 "주어진 수(N)에서 -1또는 /2 또는
 * /3을 하여 수를 최소 횟수로 줄여나가 1까지 만든다"의 사고과정을 따른다.
 * 그러나 이를 조금 바꿔 다른말로 표현 해 보자.
 *
 * 주어진 수(N)을 1로 만드는 최소 횟수는 =  'N-1을 1로 만드는 최소 횟수 + 1번'
 * 또는 'N/2를 1로 만드는 최소 횟수 +1번' 또는 'N/3을 1로 만드는 최소 횟수 + 1번'
 * 이 된다.(약간 비약적인 일반화가 있긴 했지만 N에 수를 대입해보면 이해가 갈 것이다.)
 *
 * 이를 식으로 표현하면 d[N을 1로 만드는 최소 횟수] = d[N-1을 1로 만드는 최소 횟수] +
 * 1번 or d[N/2를 1로 만드는 최소 횟수] + 1번 or D[N/3을 1로 만드는 최소 횟수] + 1번이 된다.
 * 참고 :https://minhamina.tistory.com/31


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