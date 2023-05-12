package org.example.programmers.level2;

public class level2점프와순간이동 {
    public static void main(String[] args) {
        solve(5);
    }

    static void solve(int N) {

        int answer = 0;

        while (N != 0) {
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N--;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
