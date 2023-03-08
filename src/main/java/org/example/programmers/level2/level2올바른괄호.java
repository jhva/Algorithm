package org.example.programmers.level2;

import java.util.Stack;

public class level2올바른괄호 {
    public static void main(String[] args) {
        solve("(())()");
    }

    static void solve(String s) {
        Stack<Character> stack = new Stack<>();
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if(stack.size()==0){
                    answer=false;
                    break;
                }else {
                    if (!stack.isEmpty() || stack.peek() == '(') {
                        stack.pop();
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(answer);
        } else {
            answer = false;

        }
        System.out.println(answer);
    }
}
//하이버네이트를쓴거고 구현체이다

/**
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
 * <p>
 * "()()" 또는 "(())()" 는 올바른 괄호입니다.
 * ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고
 * , 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
 * <p>
 * 제한사항
 * 문자열 s의 길이 : 100,000 이하의 자연수
 * 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
 * 입출력 예
 * s	answer
 * "()()"	true
 * "(())()"	true
 * ")()("	false
 * "(()("	false
 */
