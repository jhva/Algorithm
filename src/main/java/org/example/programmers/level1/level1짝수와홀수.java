package org.example.programmers.level1;

public class level1짝수와홀수 {
    static String answer;

    public static void main(String[] args) {
        int num = 3;
        solve(num);
        System.out.println(answer);
    }

    static String solve(int num) {

        return answer = num % 2 == 0 ? "Even" : "Odd";
    }
}
