package org.example.programmers.level1;

import java.util.Arrays;

public class level1체육복 {
    public static void main(String[] args) {
        solve(5, new int[]{2, 4}, new int[]{1, 3, 5});
    }

    static void solve(int n, int[] lost, int[] reverse) {

        int cnt = 0;
        Arrays.sort(lost); // 정렬 2, 4
        Arrays.sort(reverse);// 1, 3, 5


        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reverse.length; j++) {
                if (lost[i] == reverse[j]) {
                    lost[i] = -1;
                    reverse[j] = -1;
                    cnt++;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reverse.length; j++) {
                if (lost[i] == reverse[j] + 1 || lost[i] == reverse[j] - 1) {
                    cnt++;
                    reverse[j] = -1;
                    break;
                }
            }
        }

//        System.out.println(n-lost.length+cnt);
        System.out.println(Arrays.toString(lost));
        System.out.println(Arrays.toString(reverse));

    }
}
