package org.example.programmers.level2;

import java.util.Arrays;

public class level2N개의최소공배수 {
    public static void main(String[] args) {
        solve(new int[]{2, 6, 8, 14});
    }

    /**
     * 최소공배수 는 두숫자의 곱 / 두숫자의 최대공약수
     * 최대공약수는 나눌수있을때까지 나눈 수 gcd
     */
    static void solve(int[] arr) {
//        int index = 0;
//        int answer = 1;
//        while (index != arr.length) {
//
//
//            answer *= arr[index] % 2 == 0 ? arr[index] / 2 : arr[index];
//            index++;
//        }
//        answer *= 2;
//        System.out.println(answer * 2);

        /**
         *
         * 2개의 자연수 또는 정식의 최대 공약수
         *
         * A,B 두수는 자연수고 a가 b보다 커야된다 .
         *
         * 최소공배수 문제를 구해야하는데 최대공약수를 왜 알아야 하는지 생각하는 사람들도 있을 것이다.
         * 하지만 최소공배수와 최대 공약수는 매우 밀접한 관계가 있고
         * 두 수를 곱하고 최대공약수로 나누면 그것이 최소공배수가 되기 때문이다.
         */

        int answer = arr[0];

        for (int i = 0; i < arr.length; i++) {
            answer = result(answer, arr[i]);
        }
        System.out.println(answer);

    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; //나머지
            a = b;
            b = r;
        }
        return a;

    }

    static int result(int a, int b) {
        return a * b / gcd(a, b);
    }
}
