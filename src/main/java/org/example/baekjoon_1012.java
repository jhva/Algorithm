package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_1012 {

    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] visit;
    static int count;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if (!visit[cx][cy] && cabbage[cx][cy] == 1) {
                    dfs(cx, cy);
                }
            }

        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            cabbage = new int[M][N];
            visit = new boolean[M][N];

            K = Integer.parseInt(st.nextToken());
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                cabbage[p1][p2] = 1;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (cabbage[x][y] == 1 && !visit[x][y]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }

}

//
//public class baekjoon_1012 {
//    static int M;
//    static int N;
//    static int K;
//    static int[] dr = {-1, 1, 0, 0};
//    static int[] dc = {0, 0, -1, 1};
//    static int[][] map;
//    static boolean[][] visit;
//    static int result;
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        for (int i = 1; i < T; i++) {
//            M = sc.nextInt();// 배추밭 가로길이
//            N = sc.nextInt();// 세로
//            K = sc.nextInt();// 위치 개수
//            map = new int[M][N]; //배추밭
//            visit = new boolean[M][N];
//            result = 0;
//
//            //배추밭 dlqfur
//            for (int j = 0; j < K; j++) {
//                map[sc.nextInt()][sc.nextInt()] = 1;
//            }
//
//            for (int k = 0; k < M; k++) {
//                for (int t = 0; t < N; t++) {
//                    //배추가있으면서 방문하지않으면 dfs탐색
//                    if (map[k][t] == 1 && !visit[k][t]) {
//                        result++;
//                        dfs(k, t);
//
//                    }
//                }
//            }
//            System.out.println(result);
//        }
//    }
//
//    public static void dfs(int k, int t) {
//        //방문 체크 시도
//        visit[k][t] = true;
//
//        //상하 좌우 탐색
//        for (int i = 0; i < 4; i++) {
//            int ranger = k + dr[i];
//            int rangec = t + dc[i];
//
//
//            //범위에있다.
//            if (ranger >= 0 && rangec >= 0 && ranger < M && rangec < N) {
//                if (map[ranger][rangec] == 1 && !visit[ranger][rangec]) {
//                    //배추가있고 방문하지않으면 dfs
//                    dfs(ranger, rangec);
//                }
//            }
//        }
//    }
//}