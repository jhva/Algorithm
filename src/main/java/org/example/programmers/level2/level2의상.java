package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class level2의상 {
    public static void main(String[] args) {
        solve(
            new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
    }

    //return 5
    static void solve(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String value = clothes[i][0];
            String key = clothes[i][1];
            // map.put(key,value);

            map.put(key, map.getOrDefault(key, 1) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
            answer *= map.get(key);

        }
        System.out.println(answer-1);
        System.out.println(map);
    }
}
















