package org.example.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            //입력 받기
        }
        int X = sc.nextInt(); // 자연수 x
        Arrays.sort(arr);

//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] + arr[j] == X) {
//                    cnt++;
//                    arr[j] = 0;
//                }
//            }
//        } // 시간 초과 n이 10 만ㅇ 이였음

        int left = 0, right = N - 1;
        int result = 0;
        while (left < right) {
            int cnt = arr[left] + arr[right];

            if (cnt == X) {
                result++;
                left++;
                right--;
            } else if (cnt > X) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(result);

    }
}
