package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class level2줄서는방법 {
    public static void main(String[] args) {
        solve(3, 5);
    }

    static void solve(int n, long k) {

        int[] ans = new int[n];
        int idx = 0;

        ArrayList<Integer> list = new ArrayList<>();
        long fac = 1;

        for (int i = 1; i <= n; i++) {
            fac *= i;
            list.add(i);
        }
        k--;
        while (n > 0) {
            fac /= n;
            int v = (int)(k / fac);
            ans[idx] = list.get(v);

            list.remove(v);
            k%=fac;
            idx++;
            n--;
        }
        System.out.println(Arrays.toString(ans));

    }
}
