package org.example.baekjoon;

import java.util.Scanner;

public class beakjoon_17427 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += n / i * i;
        }

        System.out.println(answer);
    }
}
