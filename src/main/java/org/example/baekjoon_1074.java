package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_1074 {
    static int N, R, C, cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        solve(0, 0, (int) Math.pow(2, N));
//        double cnt = Math.pow(2, N);
//        System.out.println(cnt);
    }

    //풀이봄
    public static void solve(int r, int c, int size) {
        if (size == 1) {
            System.out.println(cnt);
            return;
        }

        int newSize = size / 2;

        if (R < r + newSize && C < c + newSize) {
            solve(r, c, newSize);
        }
        if (R < r + newSize && c + newSize <= C) {
            cnt += (size * size) / 4;
            solve(r, c+newSize, newSize);
        }
        if (r + newSize <= R && C < c + newSize) {
            cnt += ((size * size) / 4) * 2;
            solve(r+newSize, c, newSize);
        }
        if (r + newSize <= R && c + newSize <= C) {
            cnt += ((size * size) / 4) * 3;
            solve(r+newSize, c+newSize, newSize);
        }

    }
}
