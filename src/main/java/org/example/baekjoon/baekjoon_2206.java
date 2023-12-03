package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon_2206 {
    static class Place {
        int y;
        int x;
        int dis;
        int broken;

        public Place(int y, int x, int dis, int broke) {
            this.y = y;
            this.x = x;
            this.dis = dis;
            this.broken = broke;
        }
    }

    static int[][] map;
    static int[][] len;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};
    static int[][] visit;
    static int N, M, ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visit = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(str[j]);
                visit[i][j] = Integer.MAX_VALUE;
            }
        }
        ans = Integer.MAX_VALUE;
        bfs(0, 0);
        if (ans == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(ans);
    }

    static void bfs(int y, int x) {
        Queue<Place> que = new LinkedList<Place>();

        que.add(new Place(y, x, 1, 0));
        visit[y][x] = 0;
        while (!que.isEmpty()) {
            Place p = que.poll();

            if (p.y == N - 1 && p.x == M - 1) {
                ans = p.dis;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];

                if (ny < 0 || nx < 0 || ny >= N || nx >= M)
                    continue;

                if (visit[ny][nx] <= p.broken)
                    continue;
                if (map[ny][nx] == 0) {
                    visit[ny][nx] = p.broken;
                    que.add(new Place(ny, nx, p.dis + 1, p.broken));
                } else {
                    if (p.broken == 0) {
                        visit[ny][nx] = p.broken + 1;
                        que.add(new Place(ny, nx, p.dis + 1, p.broken + 1));
                    }
                }
            }
        }
    }
}
