package org.example.baekjoon;

import java.util.Scanner;

public class OX퀴즈_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "";

        for (int i = 0; i < N; i++) {
            str = sc.next();
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}


/**
 * OOXXOXXOOO와 같은 OX퀴즈의 결과가 있다.
 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 */