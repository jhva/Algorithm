package org.example.재귀;

import java.util.Scanner;

public class 팩토리얼_108723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();
        int sum = testMethod(N);
        System.out.println(sum);
    }

    public static int testMethod(int num) {


        if (num <= 0) {
            return 1;
        }

        return num * testMethod(num - 1);
        /**
         * Ex
         * 처음 들어온값이 5 면
         * 5 * 5 -1
         * 5* 4 *4-1
         */
    }
}

/**
 * 재귀 : 함수안에 func 호출하고 호출 한 func 안에 func 을 참조하는 방법이 재귀방법임
 */