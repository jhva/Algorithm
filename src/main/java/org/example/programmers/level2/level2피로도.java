package org.example.programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class level2피로도 {
    private static int answer = 0;
    private static boolean[] visited;

    public static void main(String[] args) {
        solve(80, new int[][] {{80, 20}, {50, 40}, {30, 10}});
    }

    static void solve(int k, int[][] dungeons) {

        //57점 다돌아야하는데 안돌았다.
        // int cnt = 0;

        // Arrays.sort(dungeons, (a, b) -> a[0] - b[0]);
        //
        // System.out.println(Arrays.deepToString(dungeons));
        // //80 20 30 10 50 40
        // int value = k;
        // for (int j = dungeons[0].length; j >= 0; j--) {
        //     int ieastPirodo = dungeons[j][0];
        //     int maximumPirodo = dungeons[j][1];
        //     if (ieastPirodo <= maximumPirodo)
        //         continue;
        //     if (value >= k) {
        //         value -= maximumPirodo;
        //         cnt++;
        //     }
        //     value = k;
        // }

        answer = 0;
        visited = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        System.out.println(answer);
    }

    static void dfs(int[][] dungeon, int k, int depth) {
        answer = Math.max(answer, depth);

        for (int i = 0; i < dungeon.length; i++) {
            if (!visited[i] && k >= dungeon[i][0]) {
                visited[i] = true;
                k -= dungeon[i][1];
                dfs(dungeon, k, depth + 1);

                visited[i] = false;
                k += dungeon[i][1];
            }
        }
    }
}
//c최소 필요피로도

// 던전을 마쳣을때 소모 피로도