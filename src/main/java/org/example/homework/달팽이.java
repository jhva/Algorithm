package org.example.homework;

import java.util.Arrays;

public class 달팽이 {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {

        int[][] arr = new int[5][5];
        int number = 0;
        int y = 0;
        int x = -1;

        int size = arr.length; // ㄱ 까지가 5 ㄴ 4 다시 3 2  마지막 1
        int incAndDec = 1; // 1, -1

        while (size > 0) {

        for (int i = 0; i < size; i++) {
            x += incAndDec; // 2번 기존 x 값을 -1 = 2
            number += 1;
            arr[y][x] = number; // arr[4][2]=10;
        }
        size -= 1;

        for (int j = 0; j < size; j++) {
            y += incAndDec;
            number += 1;
            arr[y][x] = number;
        }
        incAndDec *= -1; // 1번 ㄱ 까지 돌렸을때 1  *-1 = -1
        }


        /**
         *  빡대가리라 못하겠네요 달팽ㅇ ㅣ
         */


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
