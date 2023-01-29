package org.example.programmers.level1;

import java.util.Arrays;

public class level1x만큼각격이있는n개의숫자 {
    public static void main(String[] args) {
        solve(-4, 2);
    }

    static void solve(int x, int n) {
        long[] arr = new long[n];

        for (long i = 0; i < n; i++) {
//            arr[i] = x*i;
            arr[(int) i] = (i*x)+x;
            System.out.println(Arrays.toString(arr));

        }
    }
}
