package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        solve(new ArrayList<>(List.of(1, 2, 1, 3, 2)), 3, 2);
    }

    static void solve(List<Integer> s, int d, int m) {

        int ans = 0;
        int sum = 0;
        for (int i = 0; i < m - 1; i++) { //
            sum += s.get(i);
        }
        for (int j = m - 1; j < s.size(); j++) {
            if (j - m < 0) {
                System.out.println(j);
            }
            sum -= (j - m) < 0 ? 0 : s.get(j - m);
            sum += s.get(j);
            if (sum == d)
                ans++;
        }

        System.out.println(ans);

    }
}
