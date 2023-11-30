package org.example.baekjoon;

import java.util.Scanner;

public class baekjoon_1780 {
    static int[][] board;
    static int GRAY = 0;
    static int WHITE = 0;
    static int BLACK = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        recursive(0, 0, N);
        System.out.println(GRAY);
        System.out.println(WHITE);
        System.out.println(BLACK);
    }

    static void recursive(int row, int col, int n) {
        if (findColor(row, col, n)) {
            if (board[row][col] == -1) {
                GRAY++;
            } else if (board[row][col] == 0) {
                WHITE++;
            } else {
                BLACK++;
            }
            return;
        }
        int newSize = n / 3;

        recursive(row, col, newSize);
        recursive(row, col + newSize, newSize);
        recursive(row, col + 2 * newSize, newSize);

        recursive(row + newSize, col, newSize);
        recursive(row + newSize, col + newSize, newSize);
        recursive(row + newSize, col + 2 * newSize, newSize);

        recursive(row + 2 * newSize, col, newSize);
        recursive(row + 2 * newSize, col + newSize, newSize);
        recursive(row + 2 * newSize, col + 2 * newSize, newSize);
    }

    static boolean findColor(int row, int col, int n) {

        int color = board[row][col];
        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (color != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
