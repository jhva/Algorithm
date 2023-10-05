package org.example.hacker.easy;

import java.util.Collections;
import java.util.List;

public class Mini_MaxSum {
    public static void main(String[] args) {
        solve(List.of(1, 2, 3, 4, 5));
    }

    static void solve(List<Integer> arr) {
        long min = 0;
        long max = 0;
        Collections.sort(arr); // Compile error!

        for (int i = 0; i < arr.size() - 1; i++) {
            min += arr.get(i);
        }

        for (int i = 1; i < arr.size(); i++) {
            max += arr.get(i);
        }

        System.out.println(min + " " + max);

    }

}
