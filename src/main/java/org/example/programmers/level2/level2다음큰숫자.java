package org.example.programmers.level2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class level2다음큰숫자 {

    public static void main(String[] args) {

        solve(78);
    }

    static void solve(int n) {
        if (n == 1000001) {
            System.out.println("-1");
        }
        int prevNum = n; //n을 넣어놓자
        boolean flang = true;
        int cnt = 0; //1 갯수  4

        while (flang) {
            String temp = String.valueOf(Integer.toBinaryString(n));
            /**
             * 한 이유 제한이 백만이기때문에 백만일때 ?
             * 개수를 세어버리면 시간초과가 날거같아서 애초에 스트링으로 받고
             * 해주었다. 해결~
             *
             *
             */
            int nextStrCnt = 0;
            for (int i = 0; i < temp.length(); i++) {
                char c = temp.charAt(i);

                if (c == '1') {
                    cnt++;
                }

            }
            if (nextStrCnt == cnt) {
                if (prevNum < n) {
                    prevNum = n;
                }
                flang = false;
                break;
            }
            if (cnt == 0) {
                cnt = nextStrCnt;
            }
            n++;

        }
        System.out.println(prevNum);


    }
}

/**
 * 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
 * <p>
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
 * 예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
 * <p>
 * 자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
 * <p>
 * 제한 사항
 * n은 1,000,000 이하의 자연수 입니다.
 * 입출력 예
 * n	result
 * 78	83
 * 15	23
 * 입출력 예 설명
 * 입출력 예#1
 * 문제 예시와 같습니다.
 * 입출력 예#2
 * 15(1111)의 다음 큰 숫자는 23(10111)입니다.
 */