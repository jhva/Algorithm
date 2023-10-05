package org.example.programmers.level3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class level3보석쇼핑 {
    public static void main(String[] args) {
        solve(new String[] {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"});
    }

    static void solve(String[] gems) {
        int[] answer = {};
        HashSet<String> hashSet = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String gen : gems) {
            hashSet.add(gen);
        }
        int left = 0, right = 0, start = 0, end = 0, distance = Integer.MAX_VALUE;

        while (true) {

            if (hashSet.size() == hashMap.size()) {
                hashMap.put(gems[left], hashMap.get(gems[left]) - 1);

                if (hashMap.get(gems[left]) == 0) {
                    hashMap.remove(gems[left]);
                }
                left++;
            } else if (right == gems.length)
                break;
            else {
                hashMap.put(gems[right], hashMap.getOrDefault(gems[right], 0) + 1);
                right++;

            }

            if (hashMap.size() == hashSet.size()) {
                if (right - left < distance) {
                    distance = right - left;
                    start = left + 1;
                    end = right;

                }
            }
        }
        answer = new int[2];
        answer[0] = start;
        answer[1] = end;
        System.out.println(Arrays.toString(answer));
    }

}
