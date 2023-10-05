package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        solve(7, new ArrayList<>(List.of(2, 5, 4, 5, 2)));
    }

    static void solve(int k, List<Integer> height) {
        Collections.sort(height);
        Collections.reverse(height);
        int ans = k >= height.get(0) ? 0 : height.get(0) - k;
        System.out.println(ans);
    }
}
