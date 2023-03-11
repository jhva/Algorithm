package org.example.baekjoon;

import java.util.Scanner;

public class 숫자의합_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String Nt = sc.next();

        sc.close();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Nt.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}

//아스키코드를 항상 생각하자 ㄴ