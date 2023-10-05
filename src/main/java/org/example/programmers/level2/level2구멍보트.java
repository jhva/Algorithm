package org.example.programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class level2구멍보트 {
    public static void main(String[] args) {
        solve(new int[]{70, 50, 80, 50}, 100);
    }

    static void solve(int[] people, int limit) {
        int answer = 0;

        int index = 0;
        int len = people.length - 1;
        Arrays.sort(people);
        while (len >= index) {

            if (people[index] + people[len] <= limit) {
                index++;
                answer++;
            }else{
                answer++;
            }

            len--;
        }
        System.out.println(answer);

    }
}
