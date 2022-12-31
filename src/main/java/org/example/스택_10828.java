package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택_10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int last = 0;


        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            // 첫 번째 단어에 대한 switch-case
            switch (s) {
                case "top":
                    if (stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.peek()).append("\n");
                    break;

                case "pop":
                    if (stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.pop()).append("\n");
                    break;
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    stack.push(last);
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;

            }

        }
        System.out.println(sb);


    }
}
