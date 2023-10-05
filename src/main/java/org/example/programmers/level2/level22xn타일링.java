package org.example.programmers.level2;

import java.util.Arrays;

public class level22xn타일링 {
    public static void main(String[] args) {
        int answer = 0;
        int[] dp = new int[5];
        dp[1] = 1;
        dp[2] = 2;
        //9
        for (int i = 3; i <5; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
            answer++;
        }
        System.out.println(answer);
        System.out.println(Arrays.toString(dp));
    }
}
