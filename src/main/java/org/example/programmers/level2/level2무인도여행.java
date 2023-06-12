package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class level2무인도여행 {
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    static boolean visit[][];
    static char[][] map;
    static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) {
        solve(new String[] {"X591X", "X1X5X", "X231X", "1XXX1"});
    }

    static void solve(String[] maps) {
        visit = new boolean[maps.length][maps[0].length()];

        map = new char[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                map[i][j] = maps[i].charAt(j);
            }
        }

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                if (!visit[i][j] && maps[i].charAt(j) != 'X') {
                    answer.add(bfs(i, j));
                }
            }
        }

        if (answer.size() == 0)
            answer.add(-1);
        Collections.sort(answer);

        System.out.println(answer);

    }

    static int bfs(int x, int y) {
        int sum = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visit[x][y] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            sum += map[cx][cy]-'0';
            for(int i=0;i<4;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length)
                    continue;
                if(!visit[nx][ny] && map[nx][ny] != 'X'){
                    visit[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return sum;


    }



}

