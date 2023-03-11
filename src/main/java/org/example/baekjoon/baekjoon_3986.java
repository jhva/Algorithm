package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_3986 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        int cnt = 0;

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                if (!stack.isEmpty() && stack.peek() == str.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(str.charAt(j));

                }

            }
            if (stack.isEmpty()) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}

