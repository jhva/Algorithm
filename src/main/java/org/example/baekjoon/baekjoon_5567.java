package org.example.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon_5567 {
    static int N;
    static int M;

    static int[][] arr;
    static boolean[] visit;

    static int ans;

    public static void main(String[] args) {
        // solve();
        solve2();
    }

    static void solve2() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        List<Integer>[] list = new ArrayList[N + 1];

        for (int i = 1; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        visit = new boolean[N + 1];
        visit[1] = true;
        dfs(1, list, 0);
        System.out.println(list[1].toString());
    }

    static void dfs(int n, List<Integer>[] list, int depth) {
        if (depth == 2) {
            return;
        }
        for (int i = 0; i < list[n].size(); i++) {
            int next = list[n].get(i);
            visit[next] = true;
            dfs(next, list, depth + 1);
        }
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N + 1][N + 1];
        visit = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;

        }
        for (int i = 2; i <= N; i++) {
            if (arr[1][i] == 1) {
                if (!visit[i]) {
                    ans++;
                    visit[i] = true;
                }
                for (int j = 2; j <= N; j++) {
                    if (arr[i][j] == 1 && !visit[j]) {
                        ans++;
                        visit[j] = true;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
