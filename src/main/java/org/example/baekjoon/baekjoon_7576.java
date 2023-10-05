package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon_7576 {
    static int N, M;
    static int[] dx = {0, 0, 1, -1}; //x 축
    static int[] dy = {1, -1, 0, 0}; //y축
    static int[][] value;
    static int answer;
    static boolean[][] visit;
    static Queue<int[]> que = new LinkedList<>();
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        count = Integer.parseInt(st.nextToken());

        value = new int[N][M * count];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                value[i][j] = Integer.parseInt(st.nextToken());
                bfs(value, 0, 0);
            }
        }

    }

    static void bfs(int[][] value, int start, int end) {
        visit[0][0] = true;

    }
}
