package org.example.hacker.easy;

import java.util.Collections;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        solution(List.of(-4, 3, -9, 0, 4, 1)); //example inputs

        //original inputs 
        // https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
        //5 6 7
        //3 6 10
    }

    public static void solution(List<Integer> ar) {
        int len = ar.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        Collections.sort(ar);
        for (int i = 0; i < len; i++) {
            if (ar.get(i) < 0) {
                negative++;
            } else if (ar.get(i) == 0) {
                zero++;
            } else {
                positive = len - i;
                break;
            }
        }
        System.out.format("%6f", (float)positive / (float)len);
        System.out.println();
        System.out.format("%6f", (float)negative / (float)len);
        System.out.println();
        System.out.format("%6f", (float)zero / (float)len);
        System.out.println();
    }

}
