package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_7576 {
    static int N, M;
    static int[] dx = {0, 0, 1, -1}; //x 축
    static int[] dy = {1, -1, 0, 0}; //y축
    static int[][] value;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        value = new int[N][M];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int T = Integer.parseInt(br.readLine());
                value[i][j] = T;
            }
        }
    }

    static void bfs() {
    }
}
