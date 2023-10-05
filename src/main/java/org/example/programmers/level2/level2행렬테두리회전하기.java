package org.example.programmers.level2;

import java.util.Arrays;

public class level2행렬테두리회전하기 {
    public static void main(String[] args) {
        solve(6, 6, new int[][] {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}});
    }

    static void solve(int rows, int columns, int[][] queries) {
        int[][] origin = new int[rows][columns];
        int[][] changeforOriginArray = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                origin[i][j] = value;
                changeforOriginArray[i][j] = value;
                value++;
            }
        }

        int[] answer = new int[queries.length];

        int idx = 0;

        for (int[] query : queries) {
            int x1 = query[0] - 1;
            int x2 = query[2] - 1;
            int y1 = query[1] - 1;
            int y2 = query[3] - 1;

            int VALUE = Integer.MAX_VALUE;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (i > x2 || i < x1 || j > y2 || j < y1)
                        continue;

                    if (i == x1 && j > y1 && j <= y2) {
                        changeforOriginArray[i][j] = origin[i][j - 1];
                        VALUE = Math.min(VALUE, changeforOriginArray[i][j]);
                    } else if (i > x1 && i <= x2 && j == y2) {
                        changeforOriginArray[i][j] = origin[i - 1][j];
                        VALUE = Math.min(VALUE, changeforOriginArray[i][j]);
                    } else if (i == x2 && j < y2 && j >= y1) {
                        changeforOriginArray[i][j] = origin[i][j + 1];
                        VALUE = Math.min(VALUE, changeforOriginArray[i][j]);
                    } else if (i < x2 && i >= x1 && j == y1) {
                        changeforOriginArray[i][j] = origin[i+1][j];
                        VALUE = Math.min(VALUE, changeforOriginArray[i][j]);
                    }
                }
            }
            answer[idx++]=VALUE;



            System.out.println(Arrays.toString(answer));
        }

    }
}
