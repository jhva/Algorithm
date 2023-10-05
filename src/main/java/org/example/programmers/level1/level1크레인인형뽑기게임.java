package org.example.programmers.level1;

import java.util.Arrays;
import java.util.Stack;

public class level1크레인인형뽑기게임 {
    public static void main(String[] args) {
        solve(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
    }

    static void solve(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;

                    break;
                }
            }
        }
        System.out.println(Arrays.deepToString(board));
        System.out.println(answer);
    }

}
