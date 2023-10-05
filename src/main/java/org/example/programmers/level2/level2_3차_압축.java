package org.example.programmers.level2;

import java.util.*;

public class level2_3차_압축 {

    public static void main(String[] args) {
        solve("KAKAO");
    }

    static void solve(String msg) {
        int[] answer = {};
        ArrayList<String> dic = new ArrayList<String>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < 26; i++) {
            dic.add(String.valueOf((char)('A' + i)));
        }
        System.out.println(dic);

        for (int i = 0; i < msg.length(); i++) {
            for (int j = dic.size() - 1; j >= 0; j--) {
                if (msg.substring(i).startsWith(dic.get(j))) {// msg의 문자열에서
                    // 현재 위치에서 검사중인 사전의 문자열로 시작되는경우
                    i += dic.get(j).length() - 1;
                    result.add(j + 1);
                    if (i + 1 < msg.length())
                        dic.add(dic.get(j) + msg.charAt(i + 1));
                    break;
                }
            }
        }
        System.out.println(dic);

        answer = new int[result.size()];

        answer = result.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(answer));

        // return answer;
    }
}
