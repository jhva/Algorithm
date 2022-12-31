package org.example;

import java.io.*;
import java.util.*;

public class baekjoon_1546 {
    //    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt(); //몇개받을지
//        int[] arr = new int[N];
//        double answer = 0;
//        int max = 0;
//        int all = 0;
//        for (int i = 0; i < N; i++) {
//            arr[i] += sc.nextInt();
//            for (int j = 0; j < N; j++) {
//                if (arr[j] > max) {
//                    max = arr[i];
//                }
//                arr[i] = arr[j] / max * 100;
//
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        sc.close();

        double sum = 0;
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length - 1]) * 100);
        }
        System.out.println(sum/arr.length);
    }
}
/**
 * 점수 중 최대 값  이 값 을 M이라함 그러고나서
 * 모든점수를 점수/M *100 으로 고침
 * 자기 점수중 최대값을 고른점수가 M
 */