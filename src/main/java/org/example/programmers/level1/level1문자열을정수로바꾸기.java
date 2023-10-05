package org.example.programmers.level1;

public class level1문자열을정수로바꾸기 {
    public static void main(String[] args) {
        solve("-1234");
    }

    static void solve(String s) {
        int ans=Integer.valueOf(s);

        int answer = Integer.parseInt(s.substring(0, s.length()));
        System.out.println(answer);
    }
}
