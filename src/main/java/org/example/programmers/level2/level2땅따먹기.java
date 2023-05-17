package org.example.programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class level2땅따먹기 {
    public static void main(String[] args) {
        solve(new int[][] {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}); //result 16
    }

    static void solve(int[][] land) {
        int answer = 0;


        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][1], Math.max(land[i-1][0], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }

        int[] dp = land[land.length-1];

        Arrays.sort(dp);

        answer= dp[3];

        System.out.println(answer);


    }
}
