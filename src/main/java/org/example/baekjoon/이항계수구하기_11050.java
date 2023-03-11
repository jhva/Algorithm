package org.example.baekjoon;

import java.util.Scanner;

public class 이항계수구하기_11050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(calc(N) / (calc(N - K) * calc(K)));


    }

    public static int calc(int N) {
        if (N <= 1) return 1;
        return N * calc(N - 1);
    }
}

//이항 계수(binomial coefficient)는 n개의 서로 다른 원소 중에서 r개의 원소를 순서없이 골라내는 방법의 수　
/**
 * N! / K! (N-K)!
 * 자연수 \(N\)과 정수 \(K\)가 주어졌을 때 이항 계수
 * \(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.
 * <p>
 * <p>
 * <p>
 * 예제입력
 * 5 2
 * 5가지 경우의 수중 2개를 선택하는 경우의 수
 * 5c2
 * 5 * 4
 * =======
 * 2 * 1
 * = 10
 */