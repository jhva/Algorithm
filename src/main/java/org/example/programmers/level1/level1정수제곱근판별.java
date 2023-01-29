package org.example.programmers.level1;

public class level1정수제곱근판별 {
    static long answer;

    public static void main(String[] args) {
        solve(121);
        System.out.println(answer);
    }

    static long solve(long num) {
//        long answer = 0;
//        double mathsqrt = Math.sqrt(num);
//        System.out.println(mathsqrt);
//
//
//        answer = (long) Math.pow(mathsqrt + 1, 2);
//        System.out.println(answer);

        answer = 0;
        for (long i = 0; i <= num; i++) {
            if (i * i == num) {
                answer = (i + 1) * (i + 1);
                break;
            } else answer = -1;
        }
        return answer;
    }

    ;
}
