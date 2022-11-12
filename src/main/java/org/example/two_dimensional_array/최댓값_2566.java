package org.example.two_dimensional_array;


import java.util.Arrays;
import java.util.Scanner;

public class 최댓값_2566 {
    static Scanner sc = new Scanner(System.in);
    static int max = 0;
    static int column = 0;
    static int row = 0;

    public static void main(String[] args) {
        int[][] arrayAnswer = new int[9][9];


        makeArrayStart(arrayAnswer);
        System.out.println(max);
        System.out.println((row + 1) + "  " + (column + 1));
//        System.out.println(Arrays.deepToString(arrayAnswer));
    }

    private static void makeArrayStart(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
                if (max < array[i][j]) {
                    max = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }

    }
}


/**
 * 9x9 격자판에 쓰여지 81개 자연수 또는 0  무조건 9x9
 * <p> 최댓값을 구해야한다 . 81개중
 * <p>
 * 최댓값 과 최댓값이 몇 행 몇 열에 위치하는지 구하는 프로그램   목표
 */