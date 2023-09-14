package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        solve(new ArrayList<>(List.of(1, 4, 4, 4, 5, 3
        )));
    }

    static void solve(List<Integer> arr) {
        int ans = 0;
        int len = arr.size();

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < len; i++) {
            int valueI = arr.get(i);
            int cnt = 0;
            if (map.containsKey(valueI)) {
                cnt++;
                map.put(valueI, map.getOrDefault(valueI, 0) + cnt);
            }
        }

        for (Integer key : map.values()) {
            list.add(key);
        }
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int listV = list.get(i);
            if (max < listV) {
                max = listV;
                ans = i + 1;
            }
        }
        if (len < 5) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
