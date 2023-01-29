package org.example.programmers.level1;

import java.util.ArrayList;

public class level1약수의합 {
    public static void main(String[] args) {
        int num = 5;
        solve(5);

    }

    static int solve(int num) {
        int answer = 0;
        for (int i = 1; i < num+1; i++) {
            if (num % i == 0) {
                answer+=i;
            }
        }


        return answer;
    }
}
