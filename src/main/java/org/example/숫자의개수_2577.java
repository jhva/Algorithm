package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자의개수_2577 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//        int[] multiply = new int[A * B * C];
//        for (int i = 0; i < multiply.length; i++) {
//            multiply[i] = 0;
////            if () {
////                multiply[i]++;
////            }
//        }
//        System.out.println(Arrays.toString(multiply));
//
////        for (int i = 0; i < 10; i++) {
////
////        }
////        System.out.println(Arrays.toString(multiply));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());

        String str = Integer.toString(value);

        sc.close();
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
