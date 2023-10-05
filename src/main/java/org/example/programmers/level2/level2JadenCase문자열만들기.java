package org.example.programmers.level2;

import java.util.Arrays;

public class level2JadenCase문자열만들기 {
    public static void main(String[] args) {
        solve("  for the last week ");
    }

    static void solve(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(" ");
            } else if (s.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(s.charAt(i)));

            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));

            }

        }


        System.out.println(sb);
    }

}
