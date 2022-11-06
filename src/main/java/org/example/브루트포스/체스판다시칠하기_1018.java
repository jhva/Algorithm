package org.example.브루트포스;

import java.io.*;
import java.util.Scanner;
import java.util.*;
//
//public class 체스판다시칠하기_1018 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int column = sc.nextInt();
//        sc.nextLine();
//
//        String[] board = new String[row];
//        for (int i = 0; i < row; i++) board[i] = sc.nextLine();
//
//        int sol = Integer.MAX_VALUE;
//        for (int i = 0; i <= row - 8; i++) {
//            for (int j = 0; j <= column - 8; j++) {
//
//                int cursol = getSolution(i, j, board);
//
//                if (sol > cursol) sol = cursol;
//
//            }
//        }
//        System.out.println(sol);
//        sc.close();
//    }
//
//    private static int getSolution(int startRow, int startColumn, String[] board) {
//        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
//        int whiteSol = 0;
//        for (int i = 0; i < 8; i++) {
//            int row = startRow + i;
//            for (int j = 0; j < 8; j++) {
//                int col = startColumn + j;
//                if (board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
//                    whiteSol++;
//                }
//
//            }
//        }
//        return Math.min(whiteSol, 64 - whiteSol);
//    }
//}

public class 체스판다시칠하기_1018 {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "");


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];
        //입력
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true; // white 면 true
                } else {
                    arr[i][j] = false; // black 면 true
                }
            }
        }
        int N_row = N - 7;
        int M_row = N - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_row; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt = 0;
        boolean TF = arr[x][y];
        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != TF) {
                    cnt++;
                }

                TF = (!TF);
            }
            TF = !TF;
        }
        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }
}
/**
 * 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야한다 .
 * <p>
 * 1. 맨위 쪽 위칸이 흰색인경우
 * 2. 하나는 검은색인 경우
 */