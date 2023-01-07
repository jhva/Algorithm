package org.example;

import java.util.*;

public class baekjoon_1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[] arr = new boolean[10];
        //0 1 2 3 4 5 6 7 8 9


        for (int i = 0; i < M; i++) {
            int broken = sc.nextInt();
            //고장난 버튼 치기
            arr[broken] = true;
        }
        int cnt = Math.abs(N - 100); //초기 값


        for (int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;

            for (int j = 0; j < len; j++) {
                if (arr[str.charAt(j) - '0']) {
                    isBreak = true;
                    //고장난 버튼이라하면 더이상 탐색 x
                    break;
                }
            }
            if (!isBreak) {
                int min = Math.abs(N - i) + len;
                cnt = Math.min(min, cnt);
            }
        }
        System.out.println(cnt);
    }
}
