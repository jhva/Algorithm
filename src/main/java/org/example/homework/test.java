package org.example.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        solve(new int[] {1000, 800, 900}, 1000000, 3);
    }

    static void solve(int[] boxes, int m, int k) {

        Integer[] boxesInt = Arrays.stream(boxes).boxed().toArray(Integer[]::new);

        Arrays.sort(boxesInt, Collections.reverseOrder());

        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < boxes.length; j++) {
                if ((m * boxesInt[i] / 10000) > 100000) {
                    break;
                } else {
                    m += Math.floor(m / 10000) * boxesInt[i];
                    k--;
                    break;
                }
            }
        }
        System.out.println(m);

    }
}
