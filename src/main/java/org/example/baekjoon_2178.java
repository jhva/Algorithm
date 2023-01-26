package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_2178 {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] value;
    static boolean[][] visit;
    static int N, M;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        value = new int[N][M];
        visit = new boolean[N][M];


//        queue = new LinkedList<>();


        for (int i = 0; i < N; i++) {
            String str = sc.next(); //붙여서 넣어줘야하기때문에
            for (int j = 0; j < M; j++) {
                value[i][j] = str.charAt(j) - '0';
            }
        }
        bfs();
        System.out.println(value[N - 1][M - 1]);

    }

    static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0}); //초기값


        visit[0][0] = true; //맨처음 시작위치니까 방문체크

        while (!queue.isEmpty()) {
            int[] valueNow = queue.poll();
//            System.out.println(Arrays.toString(valueNow) + "Value Now 변수 ");
            int valueX = valueNow[0];
            int valueY = valueNow[1];

            for (int i = 0; i < 4; i++) {
                int nextX = valueX + dx[i]; //
                int nextY = valueY + dy[i]; //
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                if (visit[nextX][nextY] || value[nextX][nextY] == 0)
                    continue;

                queue.add(new int[]{nextX, nextY});
                value[nextX][nextY] = value[valueX][valueY] + 1;
                visit[nextX][nextY] = true;
            }

        }
    }
}
