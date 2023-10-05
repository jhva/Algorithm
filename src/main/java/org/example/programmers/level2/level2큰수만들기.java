package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class level2큰수만들기 {
    public static void main(String[] args) {
        solve("1924", 2);
    }

    static void solve(String number, int k) {
        // ArrayList<String> st = new ArrayList<>();
        //
        // int index = 1;
        // for (int i = 0; i < number.length(); i++) {
        //     String s = "";
        //     int v = 0;
        //     while (v <= k) {
        //         s += String.valueOf(number.charAt(i)) + String.valueOf(number.charAt(index));
        //         st.add(s);
        //         s = "";
        //         index++;
        //         v++;
        //     }
        //     index = 1;
        // }
        // String answer = Collections.max(st);
        // System.out.println(answer);
        // System.out.println(st);
        // ArrayList<String> st = new ArrayList<>();
        //
        // for (int i = 0; i < number.length() - 1; i++) {
        //     for (int j = i + 1; j < Math.min(i + 1 + k, number.length()); j++) {
        //         String s = number.substring(i, i + 1) + number.substring(j, j + 1);
        //         st.add(s);
        //     }
        // }
        //
        // String answer = Collections.max(st);
        // System.out.println(answer);
        // System.out.println(st);

        StringBuilder sb = new StringBuilder();
        int index = 0;
        int next = 0;

        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;
            for (int j = index; j <= i + k; j++) {
                int cur = number.charAt(j) - '0';
                if(max <cur){
                    max=cur;
                    next=j;
                }
            }
            sb.append(max);
            index = next+1;
            System.out.println(sb);

        }
        System.out.println(sb.toString());
    }
}
