package org.example.재귀;

import java.io.*;
import java.util.Scanner;

/**
 * 아 .. 어려워 ... 문제는 이해했어도 코드를 어떻게 풀어나가야할지몰랐던 문제 ... ㅠ
 */

public class 별찍기_2447 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //몇 개의 입력

        arr = new char[N][N];

        starPress(0, 0, N, false);
        //맨처음엔 다 false 공백은 true로 하여  true인값 ' '공백
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static void starPress(int x, int y, int N, boolean trueBlank) {
        if (trueBlank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (N == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = N / 3;
        int cnt = 0;

        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                cnt++;
                if (cnt == 5) {
                    starPress(i, j, size, true);
                } else {
                    starPress(i, j, size, false);
                }
            }
        }
    }

}
