package org.example.브루트포스;

import java.util.Scanner;

public class 분해합_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 216
        int check = 0;
        for (int i = 0; i < N; i++) {
            int con = i;
            int sum = con;
            while (con > 0) {
                sum = sum + con % 10;
                System.out.println(sum + "sum");
                con = con / 10;
                System.out.println(con + "con");
            }
            if (sum == N) {
                sum++;
                System.out.println(i);
                break;
            }
        }
        if (check == 0) {
            System.out.println(0);
        }
        //분해합= 각 자릿수의 합을 의미한다.


    }
}

/**
 * 각자리수 더하기
 * 예를들어 숫자N이 789이면
 * 합을 저장할 sum변수란 곳에 10을 나눈 나머지를 넣고
 * 다시 i에 10을 나눈 몫을 저장한다 .
 * <p>
 * <p>
 * 문제에서 자연수 N 은 ㅇ n과 n 의 각 자릿숫를 더한 것을 분해합이라고 함
 * 분해합은 A라고 할때 N은 A의 생성자가 됨 .
 */