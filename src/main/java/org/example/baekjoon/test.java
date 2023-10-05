package org.example.baekjoon;

import java.math.BigDecimal;
import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        testMethod(22, 9);
    }

    public static void testMethod(int num, int k) {
        int index = 0;

        try {
            long temp = Long.valueOf(num);

            while (temp % k != 0) {
                String temp2 = String.valueOf(num);
                temp += Long.parseLong(temp2);


                index++;
            }
        } catch (NumberFormatException e) {
            index = -1;
        }
        System.out.println(index + 1);
//        if (num == 0) {
//            return;
//        }
//        System.out.println("안녕하세요");
//
//        testMethod(num - 1);
    }
}
