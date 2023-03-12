package org.example.programmers.level3;

import java.util.*;

public class level3순위 {
    public static void main(String[] args) {
        solve(5, new int[][]{{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}});
    }

    static void solve(int n, int[][] results) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
//            map.put(i, List.of());
            map.put(i, 0);
        }
        Arrays.sort(results, Comparator.comparingInt(o1 -> o1[0]));

        int answer = 0;
        System.out.println(map);

        System.out.println(Arrays.deepToString(results));

        for (int i = 1; i <= results.length; i++) {
//            System.out.println(map.get(i - 1));
            for (int j = 0; j < results[i - 1].length; j++) {
//                System.out.println(results[i - 1][j]);
//                list.add(results[i - 1][j]);
                map.put(i, results[i - 1][j]);

//                if (j == 2) {
//                    list.add(results[i - 1][j - 1]);
//
//                    map.put(i, list);
//                }
//                list.add(3);
//                list.add(4);
//                map.put(4, list);
//                map.get(4);
//                System.out.println(j);
//                map.put(i,Map.of())
//                map.put(i, Map.of(i, results[i - 1][j - 1]));
//                System.out.println();
//                testMethod(map,);
            }
        }
        int min = 0;
        for (Integer num : map.keySet()) {
            min = num;

            if (min < num) min = num;

        }
        answer = map.get(min);
        System.out.println(map);
//        testMethod(map, results, index, start);
        System.out.println(answer);


    }

    static void testMethod(Map<Integer, Map<Integer, String>> list) {
    }
}
