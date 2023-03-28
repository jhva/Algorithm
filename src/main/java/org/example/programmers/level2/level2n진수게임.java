package org.example.programmers.level2;

public class level2n진수게임 {
    public static void main(String[] args) {
        solve(2,4,2,1);
    }

    static void solve(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; sb.length() <= t * m; i++) {
            sb.append(Integer.toString(i, n));
        }
        System.out.println(sb.toString());

        for (int i = p - 1; answer.length() < t; i += m) {
            System.out.println(i);
            answer.append(sb.charAt(i));
        }
        System.out.println(answer.toString().toUpperCase());

    }
}
