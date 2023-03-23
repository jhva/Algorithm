package org.example.programmers.level2;

import java.util.*;

public class level2뉴스클러스터링 {
    public static void main(String[] args) {
        solve("FRANCE", "french");
    }

    static int solve(String str1, String str2) {
        int answer = 0;
        double union = 0;
        double inter = 0;
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            String s = str1.substring(i, i + 2).replaceAll("[^A-Z]", "");
            if (s.length() < 2)
                continue;
            hashMap1.put(s, hashMap1.getOrDefault(s, 0) + 1);
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            String s = str2.substring(i, i + 2).replaceAll("[^A-Z]", ""); // 대문자가아니면 다 제거
            if (s.length() < 2)
                continue;

            hashMap2.put(s, hashMap2.getOrDefault(s, 0) + 1);
            // 이미 존재한다면 해당 key값을 1증가하고 존재하지않을시 key를 재생성하여 1로설정

        }

        if (hashMap1.size() == 0 && hashMap2.size() == 0)
            return 65536;
        System.out.println(hashMap1);
        System.out.println(hashMap2);
        for (String key : hashMap1.keySet()) {
            if (hashMap2.containsKey(key)) {
                inter += Math.min(hashMap1.get(key), hashMap2.get(key));
                union += Math.max(hashMap1.get(key), hashMap2.get(key));
                hashMap2.remove(key);
            } else {
                System.out.println(hashMap1.get(key));

                union += hashMap1.get(key);
            }
        }

        System.out.println(inter);
        System.out.println(union);

        for (String key : hashMap2.keySet()) {
            union += hashMap2.get(key); // remove한거제외하고 나머지부분들을 다 더해준다
        }
        answer = (int)Math.floor((inter / union) * 65536);
        System.out.println(answer);
        return answer;
    }
}
