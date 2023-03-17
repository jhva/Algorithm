package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class level2예상대진표 {
    public static void main(String[] args) {
        solve(8, 4, 7);
    }

    static void solve(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            answer++;
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }
        System.out.println(answer);

//        System.out.println(cnt);

    }
}
