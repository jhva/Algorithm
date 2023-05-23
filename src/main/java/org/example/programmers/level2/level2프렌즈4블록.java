package org.example.programmers.level2;

import java.util.Arrays;

public class level2프렌즈4블록 {
    public static void main(String[] args) {
        String[] str = new String[] {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        solve(4, 5, str);
    }

    static void solve(int m, int n, String[] board) {

        int ans = 0;
        char[][] map = new char[m][n];

        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray(); //2차원배열로선언했는데 이렇게도 되네
        }

        while (true) {
            int cnt = check(m, n, map);
            if (cnt == 0)
                break;
            ans += cnt;
            dropblock(m, n, map);
        }

    }

    static void dropblock(int m, int n, char[][] map) {
        for (int c = 0; c < n; ++c) {
            for (int r = m - 1; r >= 0; --r) {
                if (map[r][c] == '.') {
                    for (int nr = r - 1; nr >= 0; --nr) {
                        if (map[nr][c] != '.') {
                            map[r][c] = map[nr][c];
                            map[nr][c] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }

    static int check(int m, int n, char[][] map) {
        int cnt = 0;
        boolean[][] ischeck = new boolean[m][n];

        for (int i = 0; i < m - 1; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                if (map[i][j] == '.')
                    continue;
                checkfour(map, ischeck, i, j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; ++j) {
                if (ischeck[i][j]) {
                    cnt++;
                    map[i][j] = '.';
                }
            }
        }

        return cnt;
    }

    static void checkfour(char[][] map, boolean[][] ischeck, int i, int j) {
        char block = map[i][j];

        for (int r = i; r < i + 2; ++r) {
            for (int c = j; c < j + 2; ++c) {
                if (map[r][c] != block)
                    return;
            }
        }

        for (int r = i; r < i + 2; ++r) {
            for (int c = j; c < j + 2; ++c) {
                ischeck[r][c] = true;
            }
        }
    }
}
