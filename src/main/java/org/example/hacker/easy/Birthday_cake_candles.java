package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Birthday_cake_candles {
    public static void main(String[] args) {
        solve(new ArrayList<>(List.of(3, 2, 1, 3)));
    }

    static void solve(List<Integer> candles) {
        int ans = 0;

        Collections.sort(candles);

        int max = candles.get(candles.size() - 1);
        for (int i = 0; i < candles.size(); i++) {
            int SingleCandle = candles.get(i);
            if (SingleCandle >= max) {
                ans++;
            }

        }

        System.out.println(ans);
    }
}
