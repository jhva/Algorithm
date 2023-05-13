package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class level2귤고르기 {
    private static Map<Integer, Integer> map;

    public static void main(String[] args) {
        solve(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3});
    }

    static void solve(int k, int[] tangerine) {
        int answer = 0;
        map = new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        System.out.println(entries);

        for (Map.Entry<Integer, Integer> entry : entries) {
            if (k <= 0)
                break;
            answer++;
            k -= entry.getValue();
        }
        System.out.println(answer);
    }
}
