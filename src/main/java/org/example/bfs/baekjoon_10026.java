package org.example.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon_10026 {
    static char[][] arr;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};
    static int[] answer;
    static boolean visits[][];
    static int N;

    public static void main(String[] args) throws IOException {
        solve();
    }

    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        visits = new boolean[N][N];
        int answer1 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visits[i][j]) {
                    bfs(i, j, arr[i][j]);
                    answer1++;
                }
                if (arr[i][j] == 'G') {
                    arr[i][j] = 'R';
                }
            }
        }

        visits = new boolean[N][N];
        int answer2 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visits[i][j]) {
                    bfs(i, j, arr[i][j]);
                    answer2++;
                }
            }
        }

        System.out.println(answer1 + " " + answer2);
    }

    public static void bfs(int x, int y, char target) {
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[] {x, y});
        visits[x][y] = true;

        while (!que.isEmpty()) {
            int[] poll = que.poll();

            int currentX = poll[0];
            int currentY = poll[1];

            for (int i = 0; i < 4; i++) {
                int next = currentX + dx[i];
                int nextY = currentY + dy[i];
                if (next >= 0 && nextY >= 0 && next < N && nextY < N) {
                    if (arr[next][nextY] == target && !visits[next][nextY]) {
                        visits[next][nextY] = true;
                        que.offer(new int[] {next, nextY});
                    }
                }
            }
        }
    }

}
