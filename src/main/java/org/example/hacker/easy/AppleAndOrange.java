package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        solve(7, 11, 5, 15, new ArrayList<>(List.of(-2, 2, 1)), new ArrayList<>(List.of(5, 6)));
    }

    //https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
    static void solve(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int newAppletreeDistance = 0;
        int newOrangetreeDistance = 0;

        for (int i = 0; i < apples.size(); i++) {
            int originAppleTree = apples.get(i);
            int newDistanceApple = originAppleTree + a;

            if (s <= newDistanceApple && newDistanceApple <= t) {
                newAppletreeDistance++;
            }

        }
        for (int i = 0; i < oranges.size(); i++) {
            int originOrangeTree = oranges.get(i);
            int newDistanceOrange = originOrangeTree + b;

            if (s <= newDistanceOrange && newDistanceOrange <= t) {
                newOrangetreeDistance++;
            }
        }
        System.out.println(newAppletreeDistance);
        System.out.println(newOrangetreeDistance);
    }
}
