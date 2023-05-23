package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.stream.Collectors;

public class level2롤케이크자르기 {
    public static void main(String[] args) {
        solve(new int[] {1, 2, 1, 3, 1, 4, 1, 2});
    }

    static void solve(int[] topping) {
        // //result 2
        // int answer = 0;
        //
        // boolean flag = true;
        // Set<Integer> cul = new HashSet<>();
        // Set<Integer> bro = new HashSet<>();
        // int middleLen = topping.length / 2 - 1;
        //
        // while (flag) {
        //     for (int i = 0; i < middleLen; i++) {
        //         cul.add(topping[i]);
        //     }
        //     for (int j = middleLen; j < topping.length; j++) {
        //         bro.add(topping[j]);
        //     }
        //     if (cul.size() == bro.size()) {
        //         answer++;
        //     }
        //     middleLen++;
        //     if (middleLen == topping.length - 2) {
        //         flag = false;
        //     } else {
        //         cul.clear();
        //         bro.clear();
        //     }
        // }
        int answer = 0;
        for (int i = 1; i < topping.length; i++) {
            Set<Integer> set1 = Arrays.stream(Arrays.copyOfRange(topping, 0, i))
                .boxed()
                .collect(Collectors.toSet());

            Set<Integer> set2 = Arrays.stream(Arrays.copyOfRange(topping, i, topping.length))
                .boxed()
                .collect(Collectors.toSet());

            if (set1.size() == set2.size()) {
                answer++;
            }
        }

    }
}
