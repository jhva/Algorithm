package org.example.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class level2행렬의곱셈 {
    public static void main(String[] args) {
        solve(new int[][] {{2, 3, 2}, {4,2,4}, {3,1,4}}, new int[][] {{5, 4, 3}, {2, 4, 1},{3,1,1}});
    }

    static void solve(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }

        //arr1에서 2, 3 2 를  arr2[0][j] arr[1][j]arr[2][j]
        // 2 3 2  = 5 2 3
        // 2 3 2  = 4 4 1
        // 2 3 2 == 3 1 1

        // 4 2 4 = 5 2 3
        // 4 2 4 = 4 4 1
        // 4 2 4 = 3 1 1

        //...
        //..


        System.out.println(Arrays.deepToString(answer));

    }
}


//10 6 6 22
//
//1 4 7 9
// 4

//10,12,6