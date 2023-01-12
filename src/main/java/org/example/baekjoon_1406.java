package org.example;

import java.io.*;
import java.util.Stack;

public class baekjoon_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            left.push(str.charAt(i));
        }
        int cnt = Integer.parseInt(br.readLine());


        for (int i = 0; i < cnt; i++) {
            String order = br.readLine();
            switch (order.charAt(0)) {
                case 'L':
                    if (!left.isEmpty()) right.push(left.pop());
                    break;
                case 'D':
                    if (!right.isEmpty()) left.push(right.pop());
                    break;
                case 'B':
                    if (!left.isEmpty()) left.pop();
                    break;
                case 'P':
                    left.push(order.charAt(2));
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
