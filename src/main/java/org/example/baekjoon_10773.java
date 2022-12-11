package org.example;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int M = sc.nextInt();
            if (M == 0) {
                stack.pop();
            } else {
                stack.push(M);
            }
        }
        int cnt = 0;
        for (int a : stack) {
            cnt += a;
        }
        System.out.println(cnt);
    }
}
