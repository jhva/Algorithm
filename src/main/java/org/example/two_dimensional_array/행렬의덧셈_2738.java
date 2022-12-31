package org.example.two_dimensional_array;

import java.io.IOException;
import java.util.Scanner;

public class 행렬의덧셈_2738 {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int M = sc.nextInt();

    public static void main(String[] args) throws IOException {


        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        makeArrayStart(A);
        makeArrayStart(B);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void makeArrayStart(int[][] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}


/**
 * 둘째줄 부터 N개의 행렬 A 의 원소
 * [N][M]
 */