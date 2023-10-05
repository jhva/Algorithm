package org.example.programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

public class level1문자열내p와y의개수 {
    public static void main(String[] args) {
        sovle("pPoooyY");
    }

    static boolean sovle(String str) {
//        System.out.println(Arrays.toString(strArr.toArray()));
        int p = 0;
        int y = 0;
        boolean answer = true;
        String [] strArr =str.toLowerCase().split("");
        for (int i=0; i<strArr.length; i++) {
            if ("p".equals(strArr[i])) {
                p++;
            } else if ("y".equals(strArr[i])) {
                y++;
            }
        }
        answer = p == y ? true : false;
        System.out.println(answer);
        return answer;
    }
}
