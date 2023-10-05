package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();


        Stack<Character> stack = new Stack<Character>();

        int cnt = 0;
        int temp = 1;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
                temp *= 2;
            } else if (str.charAt(i) == '[') {
                stack.push(str.charAt(i));
                temp *= 3;
            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    cnt = 0;
                    break;
                } else if (str.charAt(i - 1) == '(') {
                    cnt += temp;
                }
                stack.pop();
                temp /= 2;
            } else if (str.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    cnt = 0;
                    break;
                } else if (str.charAt(i - 1) == '[') {
                    cnt += temp;
                }
                stack.pop();
                temp /= 3;
            }
        }

        if (!stack.isEmpty()) {
            sb.append(0).append("\n");
        } else sb.append(cnt).append("\n");

        System.out.println(sb);
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//        int temp = 1;
//        int cnt = 0;
//        Stack<Character> stack = new Stack<>();
//
//
//        for (int i = 0; i < str.length(); i++) {
//            switch (str.charAt(i)) {
//                case '(':
//                    stack.push('(');
//                    temp *= 2;
//                    break;
//                case '[':
//                    stack.push('[');
//                    temp *= 3;
//                    break;
//                case ')':
//                    if (stack.isEmpty() || stack.peek() != '(') {
//                        cnt = 0;
//                        break;
//                    }
//                    //먼저들어온 index 가 '( '이거일때
//                    if (str.charAt(i - 1) == '(') {
//                        cnt += temp;
//                        break;
//                    }
//
//                    stack.pop();
//                    temp /= 2;
//                    break;
//                case ']':
//                    if (stack.isEmpty() || stack.peek() != '[') {
//                        cnt = 0;
//                        break;
//                    }
//                    if (str.charAt(i - 1) == '[') {
//                        cnt += temp;
//                    }
//                    stack.pop();
//                    temp /= 3;
//                    break;
//            }
//
//        }
//        System.out.println(!stack.isEmpty() ? 0 : cnt);

    }
}
