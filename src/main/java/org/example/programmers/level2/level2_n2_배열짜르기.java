package org.example.programmers.level2;

import java.util.Arrays;

public class level2_n2_배열짜르기 {
    public static void main(String[] args) {
        solve(3, 2, 5);
    }

    static void solve(int n, int left, int right) {
        int[] answer = new int[(int)(right - left) + 1];
        int index = 0;

        for (int i = 0; i < answer.length; i++) {
            int y = (int)(left / n + 1);
            int x = (int)(left % n + 1);
            left++;
            answer[i] = Math.max(y, x);
        }
        System.out.println(Arrays.toString(answer));

    }
}
