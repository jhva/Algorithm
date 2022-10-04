package main.java.org.example;

import java.util.Scanner;

/**
 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 * <p>
 * 입력 24 18
 * 출력 6 72
 */

public class beakjoon_2609 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int d = gcd(a, b);

        System.out.println(d);// 최대 공약수
        System.out.println(a * b / d); //최소 공배수
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println(b + "b");
        return gcd(b, a % b);
    }
}
