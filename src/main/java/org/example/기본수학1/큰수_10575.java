package main.java.org.example.기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수_10575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger C = A.add(B);
        System.out.println(C);

    }
}
