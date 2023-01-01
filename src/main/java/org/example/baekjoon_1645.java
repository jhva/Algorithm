package org.example;

import java.util.Scanner;

public class baekjoon_1645 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        int N = sc.nextInt();

        int[] arr = new int[K];


        long max = 0;


        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();//길이받기
            if (max < arr[i]) {
                //max 가 arr[i] 보다 작다면
                //max = arr[i] 값
                max = arr[i];
            }
        }
        max++;


        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;//중간길이

            long count = 0;


            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }


            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }
        System.out.println(min - 1);
    }
    //왜어렵냐 ..

}
