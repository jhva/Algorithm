package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class BreakingtheRecords {
    public static void main(String[] args) {
        solve(new ArrayList<>(List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)));
    }

    static void solve(List<Integer> scores) {
        List<Integer> ans = new ArrayList<>();
        int matchlen = scores.size();
        int max = 0;
        int min = 0;
        int minValue = scores.get(0);
        int maxValue = scores.get(0);
        for (int i = 1; i <= matchlen - 1; i++) {
            int originScore = scores.get(i);

            if (originScore > maxValue) {
                max++;

                maxValue = originScore;

            } else if (originScore < minValue) {
                min++;

                minValue = originScore;

            }

        }
        ans.add(max);
        ans.add(min);

        System.out.println(ans);

        // Write your code here

    }
}
