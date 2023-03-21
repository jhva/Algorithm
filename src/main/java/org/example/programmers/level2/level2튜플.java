package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class level2튜플 {
    public static void main(String[] args) {
        solve("{{2},{2,1},{2,1,3},{2,1,3,4}}");
    }

    static void solve(String s) {
        int[] answer = {};

        s = s.substring(2, s.length());
        s = s.substring(0, s.length() - 2).replace("},{", "-");

        String[] str = s.split("-");

        Arrays.sort(str, (o1, o2) -> (o1.length() - o2.length())); // 길이별로 정렬

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (String temp : str) {

            String[] strArr = temp.split(",");// , 기준으로

            for (int i = 0; i < strArr.length; i++) {
                int value =Integer.parseInt(strArr[i]);
                if (!list.contains(value))
                    list.add(value);
            }
        }

        answer = list.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(answer));

    }
}
