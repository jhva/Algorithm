package org.example.programmers.level1;

import java.util.*;

public class level1완주하지못한선수 {
    public static void main(String[] args) {
        solve(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
    }

    static void solve(String[] participant, String[] completion) {


        Map<String, Integer> list = new HashMap<String, Integer>();
        for (String parti : participant) list.put(parti, list.getOrDefault(parti, 0) + 1);
        for (String com : completion) list.put(com,list.get(com)-1);
        String answer = "";
        for (String key : list.keySet()) {
            if (list.get(key) != 0) {
                answer = key;
                break;
            }
        }
        System.out.println(answer);
//        int index = 0;
//        for (String str : participant) {
//            list.put(index, str);
//            index++;
//        }
//        for (int i = 0; i < list.size(); i++) {
//
//        }
    }
}

/**
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다.
 * 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * <p>
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
 * 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */