package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기_1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int left = 0;
            int right = A.length - 1;


            boolean flag = false;
            while (left <= right) {
                int middleIndex = (left + right) / 2;
                int midValue = A[middleIndex]; // 중간값

                if (midValue > num) {
                    right = middleIndex - 1;
                } else if (midValue < num) {
                    left = middleIndex + 1;
                } else {
                    //찾을때ㅔ
                    flag = true;
                    System.out.println(1);
                    break;
                }
            }
            if (!flag) {
                System.out.println(0);
            }
        }
    }
}
