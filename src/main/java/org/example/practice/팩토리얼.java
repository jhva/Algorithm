package org.example.practice;

public class 팩토리얼 {
    public static void main(String[] args) {
        int answer;
        int n = 10;
        answer = factorial(n);
        System.out.println("answer:" + answer);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
        //5! = 5*4*3*2*1

    }
}
