package org.example.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level1모의고사 {
    public static void main(String[] args) {
        solve(new int[]{1, 2, 3, 4, 5});
    }


    static void solve(int[] answers) {
        int[] firstsufoja = new int[]{1, 2, 3, 4, 5};
        int[] secondsufoja = {2, 1, 2, 3, 2, 4, 2, 5}; // 8개씩 반복
        int[] thirdsudfoja = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int len = answers.length;
        int[] answer = {0, 0, 0};
        int max;

        for (int i = 0; i < len; i++) {
            if (answers[i] == firstsufoja[i % firstsufoja.length]) answer[0]++;
            if (answers[i] == secondsufoja[i % secondsufoja.length]) answer[1]++;
            if (answers[i] == thirdsudfoja[i % thirdsudfoja.length]) answer[2]++;
        }
        max = Math.max(Math.max(answer[0], answer[1]), answer[2]);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (max == answer[0]) list.add(1);
        if (max == answer[1]) list.add(2);
        if (max == answer[2]) list.add(3);

        int[] maxhere = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            maxhere[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));


    }
}
