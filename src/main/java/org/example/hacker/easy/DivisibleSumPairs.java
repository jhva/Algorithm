package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        solve(6, 3,
            new ArrayList<>(List.of(1, 3, 2, 6, 1, 2)));
    }

    static void solve(int n, int k, List<Integer> ar) {
        int ans = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int value = ar.get(i) + ar.get(j);

                if (value % k == 0) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
