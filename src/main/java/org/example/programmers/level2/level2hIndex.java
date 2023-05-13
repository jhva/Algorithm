package org.example.programmers.level2;

import java.util.Arrays;

public class level2hIndex {
    public static void main(String[] args) {
        solve(new int[] {3, 0, 6, 1, 5});
    }

    static void solve(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);


        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                answer = h;
                break;

            }
        }
        System.out.println(answer);
    }
}
