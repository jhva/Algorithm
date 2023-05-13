package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level2멀리뛰기 {
    public static void main(String[] args) {
        solve(4);
    }

    static void solve(int n) {

        long[] answer = new long[2001];
        answer[1] = 1;
        answer[2] = 2;
        for (int i = 3; i < 2001; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }
        System.out.println(answer[n]);
    }

}
