package org.example.정렬;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬하기_11650 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

        }

        Arrays.sort(arr, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            } else {
                return x[0] - y[0];
            }
        });
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
