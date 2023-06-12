package org.example.programmers.level3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class level3최고의집합 {
    public static void main(String[] args) {
        solve(2, 9);
    }

    static void solve(int n, int s) {

        int[] ans;

        if (n > s) {
            ans = new int[] {-1};
            System.out.println(ans);
        }

        int init = s / n;
        int mod = s % n;
        ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = init;
        }

        int idx = n - 1;

        for(int m = 0; m < mod; m++){
            ans[idx]++;
            idx--;
        }

        System.out.println(Arrays.toString(ans));
    }
}
