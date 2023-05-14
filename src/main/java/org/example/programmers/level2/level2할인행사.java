package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class level2할인행사 {

    public static void main(String[] args) {
        solve(new String[] {"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1},
            new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
                "pot", "banana", "apple", "banana"});
        // solve(new String[] {"apple"}, new int[] {10},
        //     new String[] {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana",
        //         "banana"});
        //result 3
    }

    static void solve(String[] want, int[] number, String[] discount) {
        // 틀린답안

        // Map<String, Integer> map = new HashMap<>();
        //
        // for (String s : discount) {
        //     for (String str : want) {
        //         if (s.contains(str)) {
        //             map.put(s, map.getOrDefault(s, 0) + 1);
        //
        //         }
        //     }
        // }
        // List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        // int sum = 0;
        // for (int i = 0; i < number.length; i++) {
        //     sum += number[i];
        // }
        //
        // int start = 1;
        // int end = sum;
        // int size = number.length;
        //
        // while (end <= discount.length && size > 0) {
        //     if (start >= end) {
        //         break;
        //     }
        //     for (Map.Entry<String, Integer> s : entries) {
        //         int count = 0;
        //         for (int i = start; i < end; i++) {
        //             if (s.getKey().equals(discount[i])) {
        //                 count++;
        //             }
        //         }
        //         if (count >= number[start]) {
        //             size--;
        //         }
        //
        //     }
        //
        //     start++;
        //     end++;
        //
        // }
        //
        // if (entries.size() <= 0) {
        //     start = 0;
        // }
        // System.out.println(start);
        //진짜답안
        int answer = 0;

        for (int i = 0; i < discount.length - 9; i++) {
            int cntday = 0;
            for (int j = 0; j < want.length; j++) {
                int cnt = 0;
                for (int k = i; k < i + 10; k++) {
                    if (discount[k].equals(want[j]))
                        cnt++;
                }
                if (cnt < number[j])
                    break;
                else
                    cntday++;
            }
            if (cntday == want.length)
                answer++;
        }
        System.out.println(answer);
    }
}
