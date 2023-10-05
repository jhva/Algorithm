package org.example.programmers.level1;

import java.util.Arrays;

public class level1소수찾기 {
    public static void main(String[] args) {
        solve(10);
    }

    static void solve(int n) {
        boolean[] box = new boolean[n + 1];

        box[0] = box[1] = true;
        int answer = 0;


        for (int i = 2; i <= Math.sqrt(box.length); i++) {
            if (box[i]) continue;


            for (int j = i * i; j < box.length; j += i) {
                box[j] = true;
            }
        }

        for (boolean b : box) {
            if (b == false) {
                answer ++;
            }
        }
        System.out.println(answer);


    }
}
