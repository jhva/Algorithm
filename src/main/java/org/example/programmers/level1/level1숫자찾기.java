package org.example.programmers.level1;

import java.util.Arrays;

public class level1숫자찾기 {
    public static void main(String[] args) {

        solve(232443, 4);
    }

    static int solve(int num, int k) {
        String number = Integer.toString(num);
        String knumber = Integer.toString(k);
//문자열 + 숫자 = 문자열
        if (number.indexOf(knumber) == -1) {
            return -1;
        } else {
            return number.indexOf(knumber) + 1;

        }
    }

}
