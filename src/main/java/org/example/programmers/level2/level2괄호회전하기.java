package org.example.programmers.level2;

import java.util.Arrays;
import java.util.Stack;

public class level2괄호회전하기 {
    public static void main(String[] args) {
        solve("[](){}");
    }

    static void solve(String s) {

        int answer = 0;
        Stack<Character> stack = null;

        for (int i = 0; i < s.length(); i++) {
            String temp = i == 0 ? s : s.substring(i) + s.substring(0, i);
//] [](){}

            stack = new Stack<Character>();

            boolean isRight = false;

            for (char ch : temp.toCharArray()) {
                System.out.println(ch);
                if (ch == '(' || ch == '{' || ch == '[')
                    stack.push(ch);
                else {
                    if (stack.size() == 0) {
                        isRight = false;
                        break;
                    }

                    char tmpCh = stack.pop();

                    // System.out.println(ch);
                    if ((tmpCh == '(' && ch == ')')
                        || (tmpCh == '{' && ch == '}')
                        || (tmpCh == '[' && ch == ']')) {
                        isRight = true;
                    }
                }
            }

            if (isRight)
                answer++;
        }

        if (!stack.isEmpty()) {
            answer = 0;
        }
        System.out.println(answer);
    }
}
