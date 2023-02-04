package org.example.programmers.level1;

import java.util.Arrays;

public class level1최대공약수와최소공배수 {
    public static void main(String[] args) {
        solve(2, 5);
    }

    static void solve(int n, int m) {

        int[] answer = {};
        answer = new int[2];
// 유클리드 호제법ㅇ른 가장 큰수 와 가장 작은수를 찾아서 저장해놔야해서
        int maxNum = Math.max(n, m);
        int minNum = Math.min(n, m);

        answer[0] = gcd(maxNum, minNum);
        answer[1] = n * m / answer[0];

        System.out.println(Arrays.toString(answer));
    }

    static int gcd(int a, int b) {
//1 10 10, 1%10
        if (b == 0) {
            return a;
        }
        /*
        2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b)
         a와 b의 최대공약수는 b와 r의 최대공약수와 같고
         b를 r로 나눈 나머지 r'를 구하고 다
        시 r을 r로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때
        나누는 수가 a와 b의 최대공약수이다
         */
        System.out.println(a);
        System.out.println(b);
        return gcd(b, a % b);
    }
}
