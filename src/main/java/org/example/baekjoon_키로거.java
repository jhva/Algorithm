package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_키로거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String pw;

        for (int i = 0; i < N; i++) {
            pw = br.readLine();

            String pwd = getPwd(pw);
            System.out.println(pwd);
        }


    }

    public static String getPwd(String pwd) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> prevStack = new Stack<>();
        Stack<Character> nextStack = new Stack<>();

        for (int i = 0; i < pwd.length(); i++) {
            switch (pwd.charAt(i)) {
                case '<':
                    if (!prevStack.isEmpty()) {
                        nextStack.push(prevStack.pop());
                    }
                    break;
                case '>':
                    if (!nextStack.isEmpty()) {
                        prevStack.push(nextStack.pop());
                    }
                    break;
                case '-':
                    if (!prevStack.isEmpty()) {
                        prevStack.pop();
                    }
                    break;
                default:
                    prevStack.push(pwd.charAt(i));
                    break;
            }
        }
        while (!nextStack.isEmpty()) {
            prevStack.push(nextStack.pop());
        }

        for (int i = 0; i < prevStack.size(); i++) {
            sb.append(prevStack.elementAt(i));
        }
        return sb.toString();
    }
}
