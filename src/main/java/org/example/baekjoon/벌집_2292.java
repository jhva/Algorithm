package org.example.baekjoon;

import java.util.Scanner;

public class 벌집_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int coount = 1; //
        int sum = 1;


        if (N == 1) {
            System.out.println(1);

        } else {
            while (sum < N) {
                sum += 6 * coount;
                coount++;
            }
            System.out.println(coount);

        }

    }
}
