package org.example.programmers.level1;

import java.util.Arrays;

public class level1푸드파이트대회 {
    public static void main(String[] args) {

        solve(new int[]{1, 3, 4, 6});
    }

    static void solve(int[] food) {
        //food[i] 는 i 번의 음식의 수
        // food[0]은 수웅이가 준비한물 항상
        //정답의 길이가 3이상인 경우만 입력으로 주어짐
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for (int i = 0; i < food.length; i++) {
            int division = food[i] / 2;
            System.out.println(division);
            for (int j = 0; j < division; j++) {
                sb.append(i);
            }

        }
        answer = sb.toString() + "0" + sb.reverse().toString();
        System.out.println(answer);


        //0,0,1,3
        //1,2,7
        //1113
    }
}
