package org.example.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class 괄호_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(solve(sc.next()));
        }
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}


/**
 * '('
 * ')'
 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을
 * 괄호 문자열 VPS 라고 부른다.
 * <p>
 * 한 쌍의 괄호 기호로된 ")" 문자열은 기본 VPS 라고 부른다
 * 만일 x가 VPS 라면 이것을 하나의 괄호에 넣은
 * 새로운 문자열 "(x)", 도 VPS가 된다.
 * <p>
 * 그리고 두 VPS x 와 y를 접합시킨 새로운 문자열
 * xy도 vps 가 된다 .
 */
