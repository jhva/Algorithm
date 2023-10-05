package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static void main(String[] args) {
        solve(9, new ArrayList<>(List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static void solve(int n, List<Integer> ar) {

        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(ar.get(i), map.getOrDefault(ar.get(i), 0) + 1);
        }
        for (Integer value : map.values()) {
            int div;

            if (value != 1 && value % 2 == 0) {
                div = value / 2;
                ans += div;
            } else if (value != 1 && value % 2 != 0) {
                div = (value - 1) / 2;
                ans += div;
            }
        }

        System.out.println(ans);
    }
}
