package org.example.programmers.level2;

import java.util.*;

public class level2최솟값만들기 {
    public static void main(String[] args) {
        solve(new int[]{1, 2}, new int[]{3, 4});
    }

    static void solve(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int answer = 0;

        for (int i = 0; i < b.length; i++) {
            answer += a[i] * b[b.length - i - 1];
        }

        System.out.println(answer);

    }
}
