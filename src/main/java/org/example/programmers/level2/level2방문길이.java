package org.example.programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class level2방문길이 {

    public static void main(String[] args) {
        solve("ULURRDLLU");
    }

    static void solve(String dirs) {
        int answer = 0;
        int x = 0, y = 0;
        int[][][][] check = new int[11][11][11][11];

        for (Character d : dirs.toCharArray()) {
            int nx = x, ny = y;

            if (d == 'U')
                ny++;
            if (d == 'D')
                ny--;
            if (d == 'R')
                nx++;
            if (d == 'L')
                nx--;

            if (Math.abs(nx) > 5 || Math.abs(ny) > 5)
                continue;

            if (check[nx + 5][ny + 5][x + 5][y + 5] != 1) {
                check[nx + 5][ny + 5][x + 5][y + 5] = 1;
                check[x + 5][y + 5][nx + 5][ny + 5] = 1;
                answer++;
            }
            x = nx;
            y = ny;
        }

        System.out.println(answer);

        // bfs(5, 5);

    }

}
