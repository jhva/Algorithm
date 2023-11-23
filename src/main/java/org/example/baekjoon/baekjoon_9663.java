package org.example.baekjoon;

import java.util.Scanner;

public class baekjoon_9663 {
    static int[][] arr;
    static boolean[] visit;
    static int cnt = 0;
    static int N, M;

    public static void main(String[] args) {
        solve();
    }

    static void solve() {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            arr[v][w] = arr[w][v] = 1;
        }
        System.out.println(dfs(1));

        sc.close();

    }

    static int dfs(int start) {
        visit[start] = true;

        for (int i = 1; i <= N; i++) {
            if (arr[start][i] == 1 && visit[i] == false) {
                cnt++;
                dfs(i);
            }
        }
        return cnt;
    }
}
