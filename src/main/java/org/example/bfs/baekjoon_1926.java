package org.example.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1926 {
    static int N, M, cnt = 0, temp = 0;
    static int[][] map;
    static int[][] visit;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 6
        M = Integer.parseInt(st.nextToken()); // 5

        map = new int[N][M]; // 6 5
        visit = new int[N][M]; //

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int picture = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visit[i][j] == 0 && map[i][j] == 1) {
                    visit[i][j] = 1;
                    temp = 1;
                    dfs(i, j);
                    picture++;
                }
            }

        }
        System.out.println(picture);
        System.out.println(cnt);
    }

    static void dfs(int idx, int jdx) {
        if (cnt < temp) {
            cnt = temp;
        }

        for (int i = 0; i < 4; i++) {
            int nx = idx + dx[i];
            int ny = jdx + dy[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M || visit[nx][ny] == 1 || map[nx][ny] == 0)
                continue;
            temp++;
            visit[nx][ny] = 1;
            dfs(nx, ny);
        }
    }
}
