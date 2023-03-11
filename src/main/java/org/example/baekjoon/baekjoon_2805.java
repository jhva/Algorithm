package org.example.baekjoon;

import java.util.Scanner;

public class baekjoon_2805 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        int min = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {

                //높이 갱신 max
                max = arr[i];

            }

        }

        while (min < max) {
            int mid = (min + max) / 2;
            long cnt = 0;
            for (int h : arr) {
                if (h - mid > 0) {
                    cnt += (h - mid);
                }
            }

            if (cnt < M) {
                //자른나무길이의합이 작을때
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}