package org.example.programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class level2ㄱㅔ임맵최단거리 {
    static int[] dx = {0, 1, -1,0};
    static int[] dy = {1, 0, 0, -1};

    public static void main(String[] args) {
        solve(new int[][] {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1},{1,0,1,1,1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});
    }

    static void solve(int[][] maps) {
        int answer = 0;

        int[][] visit = new int[maps.length][maps.length];

        bfs(maps, visit);
        answer = visit[maps.length - 1][maps[0].length - 1];

        if (answer == 0) {
            answer = -1;
        }
        System.out.println(answer);

    }

    static void bfs(int[][] maps, int[][] visit) {

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {0, 0});

        visit[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx > maps.length - 1 || ny < 0 || ny > maps[0].length - 1) {
                    continue;
                }

                if (visit[nx][ny] == 0 && maps[nx][ny] == 1) {
                    //벽아닐경우

                    visit[nx][ny] = visit[x][y] + 1;
                    System.out.println(Arrays.deepToString(visit));
                    queue.add(new int[] {nx, ny});
                }
            }
        }

    }
}
