package org.example.hacker.medium;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        solve(30);
    }

    static void solve(int n) {
        BigInteger bi = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
            System.out.println(bi);
            /**
             * 큰 정 수 구하기
             */
        }
        System.out.println(bi);
    }


}
