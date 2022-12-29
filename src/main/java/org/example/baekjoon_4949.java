package org.example;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon_4949 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;

        while (true) {
            str = in.nextLine();

            if (str.equals(".")) {
                break;
            }
            System.out.println(stackMethod(str));
        }

    }

    public static String stackMethod(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            }

            else if (c == ')') {

                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {

                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }

}