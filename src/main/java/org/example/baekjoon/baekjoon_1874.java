package org.example.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int last_value = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            if (value > last_value) {
                for (int j = last_value + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                last_value = value;
            } else {
                if (stack.peek() != value) {
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}