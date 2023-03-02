package org.example.programmers.level1;

import java.util.*;

public class level1신고결과받기 {
    public static void main(String[] args) {
        solve(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
    }

    static void solve(String[] id_list, String[] report, int k) {
        Map<String, Integer> rank = new HashMap<String, Integer>();
        Map<String, List<Integer>> hashMap = new HashMap<>();

        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            rank.put(id_list[i], i);//초기화해준다

        }
        for (String reportStr : report) {
            String[] strArr = reportStr.split(" ");
            String first = strArr[0];

            String last = strArr[1]; // 각 신고를당한 사람들 저장

            if (!hashMap.containsKey(last)) { //map에 들어가있지않으면
                hashMap.put(last, new ArrayList<>()); // hashMap 에 신고당한사람 넣기
            }
            if (!hashMap.get(last).contains(rank.get(first))) {
                hashMap.get(last).add(rank.get(first));
            }

        }
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key).size() >= k) {
                for (int idx : hashMap.get(key)) {
                    System.out.println(idx);

                    answer[idx]++;
                    System.out.println(Arrays.toString(answer));

                }
            }
        }

        System.out.println(Arrays.toString(answer));


    }
}
