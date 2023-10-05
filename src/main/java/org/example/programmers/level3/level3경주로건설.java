package org.example.programmers.level3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class level3경주로건설 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] map;
    static int n;

    static boolean[][] visit;
    private static int cost = Integer.MAX_VALUE;

    public static void main(String[] args) {
        solve(new int[][] {{0, 0, 1}, {0, 0, 0},{0,0,0}});
    }

    static class Road {
        int x, y, dir, cost;

        Road(int x, int y, int dir, int cost) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cost = cost;
        }
    }

    static void solve(int[][] board) {
        int answer = 0;

        //자동차 경주로 건설
        //nn
        //0 : 비어있음, 1 : 벽
        //상하좌우
        //벽이있는칸 x
        //직선도로 : 100원
        //코너 : 500원
        //최소비용 : bfs

        //방향
        //상 : 0
        //우 : 1
        //하 : 2
        //좌 : 3

        n = board.length;

        map = board;
        visit = new boolean[n][n];

        bfs(0, 0, -1, 0);

        answer = cost;
        System.out.println(Arrays.deepToString(map));
        System.out.println(answer);
    }

    private static void bfs(int x, int y, int dir, int price) {

        Queue<Road> q = new LinkedList();
        q.add(new Road(x, y, dir, price));
        visit[x][y] = true;

        while (!q.isEmpty()) {
            Road road = q.remove();

            int qx = road.x;
            int qy = road.y;
            int qDir = road.dir;
            int qPrice = road.cost;

            if (qx == n - 1 && qy == n - 1) {
                cost = Math.min(cost, qPrice);
            }

            for (int i = 0; i < dx.length; i++) {
                int nx = qx + dx[i];
                int ny = qy + dy[i];
                int nDir = i;
                int nPrice = qPrice;

                if (nx < 0 || ny < 0 || nx >= n || ny >= n || map[nx][ny] == 1) {
                    continue;
                }

                if (qDir == -1) {
                    //처음엔 직선
                    nPrice += 100;
                } else if (qDir == nDir) {
                    //방향 같을 때
                    nPrice += 100;
                } else {
                    //방향 다를 때
                    nPrice += 600;
                }

                if (!visit[nx][ny] || map[nx][ny] >= nPrice) {
                    //방문 x, 이전 값이 더 클 경우 작은값을 넣어준다.
                    visit[nx][ny] = true;
                    map[nx][ny] = nPrice;
                    q.add(new Road(nx, ny, nDir, nPrice));
                }

            }
        }
    }
}
