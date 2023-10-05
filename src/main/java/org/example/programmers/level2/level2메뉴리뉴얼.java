package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class level2메뉴리뉴얼 {
    public static void main(String[] args) {
        solution(new String[] {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"},
            new int[] {2, 3, 4}
        );
    }

    static void solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < course.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            // 주문 중에 course의 단품개수로 구성 가능한 조합을 모두 찾음
            for (int j = 0; j < orders.length; j++) {
                map = dfs(orders[j], "", course[i], 0, 0, map);
            }
            // course[i]개 조합된 단품 중 최대 주문수를 찾음
            int max = -1;
            for (String key : map.keySet()) {
                max = Math.max(max, map.get(key));
            }
            // 최대 주문수 중 2 이상인 것을 찾음 (최대 주문수가 중복될 수 있음. 중복된다면 모두 코스요리로 구성)
            for (String key : map.keySet()) {
                if (map.get(key) >= 2)
                    if (max == map.get(key))
                        answer.add(key);
            }
        }
        // 정렬
        answer.sort(Comparator.naturalOrder());
        System.out.println(answer.toArray(new String[answer.size()]));
        ;
    }

    static Map<String, Integer> dfs(String order, String tmp, int max, int level, int start,
        Map<String, Integer> map) {
        if (level == max) {
            char[] carr = tmp.toCharArray();
            Arrays.sort(carr);
            tmp = String.valueOf(carr);
            map.put(tmp, map.getOrDefault(tmp, Integer.valueOf(0)) + 1);
        } else {
            for (int i = start; i < order.length(); i++) {
                dfs(order, tmp + String.valueOf(order.charAt(i)), max, level + 1, i + 1, map);
            }
        }
        return map;
    }

    // static void solve(String[] orders, int[] course) {
    //     Map<Integer, List<String>> map = new HashMap<>();
    //     HashMap<String, Integer> characters = new HashMap<>();
    //     String[] answer = {};
    //     for (int i = 0; i < orders.length; i++) {
    //         List<String> s = List.of(orders[i].split(""));
    //         map.put(i + 1, s);
    //
    //     }
    //
    //     for (Integer list : map.keySet()) {
    //         List<String> s = map.get(list);
    //         for (int j = 0; j < s.size(); j++) {
    //             characters.put(s.get(j), characters.getOrDefault(s.get(j), 0) + 1);
    //         }
    //     }
    //     int index= 0 ;
    //
    //     while(index < course.length){
    //
    //         index++;
    //     }
    //
    //     System.out.println(characters);
    //     System.out.println(map);
    //
    //     answer = new String[map.size()];
    //     //
    //     // for (int i = 0; i < map.size(); i++) {
    //     //
    //     // }
    //     //
    //     // System.out.println(map);
    //
    // }
}
