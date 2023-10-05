package org.example.programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;

public class level3정수삼각형 {
    static int[][] dp;

    public static void main(String[] args) {
        solve(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
    }

    static void solve(int[][] triangle) {
        int len = triangle.length;
        int[][] dp = new int[len][len];

        // dp 배열 초기화
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < triangle[i].length; j++) {
                dp[i][j] = triangle[i][j];
            }
        }

        // 삼각형 밑바닥부터 꼭대기 직전까지~
        for(int i = len - 1; i > 0; i--) {
            for(int j = 0; j < triangle[i].length; j++) {
                if(j - 1 >= 0) { // 범위 초과에 유의
                    dp[i - 1][j - 1] = Math.max(dp[i - 1][j - 1], triangle[i - 1][j - 1] + dp[i][j]);
                }
                if(j < triangle[i - 1].length) { // 범위 초과에 유의
                    dp[i - 1][j] = Math.max(dp[i - 1][j], triangle[i - 1][j] + dp[i][j]);
                }
            }
        }
        System.out.println(dp[0][0]);


        // for (int i = 1; i <= triangle.length + 1; i++) {
        //     for (int j = 1; j <= triangle[i-1].length + 1; j++) {
        //         if (triangle[i].length >= j) {
        //             continue;
        //         }
        //
        //         dp[i][j] = triangle[i][j] + triangle[i][j + 1];
        //
        //         // dp[0][j]=triangle[0];
        //         // dp[1][j]=1;
        //     }
        // }

        System.out.println(Arrays.deepToString(dp));
    }

}
