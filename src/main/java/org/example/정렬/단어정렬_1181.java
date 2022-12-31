package org.example.정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 단어정렬_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] str = new String[N];


        sc.nextLine();

        for (int i = 0; i < N; i++) {
            str[i] = sc.nextLine();
        }
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(str[0] + "?");

        for (int i = 1; i < N; i++) {
            if (!str[i].equals(str[i - 1])) {
                System.out.println(str[i]);
            }
        }
    }
}

/**
 * - 기준(x)이 비교대상(y)보다 크면 1, 작으면 -1, 동일하면 0을 나타낸다.
 *
 */