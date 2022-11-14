package org.example.practice;

import java.util.Scanner;

public class practice1 {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int result = ComputerSquare(N);
//        System.out.println(result);
//    }
//
//    public static int ComputerSquare(int n) {
//        return n * n;
//    }

    //    public static void main(String[] args) {
//
//        int square = 0;
//        for (int i = 1; i <= 5; i++) {
//            square = square + 5;
//        }
//        System.out.println(square);
//    }
//    public static void main(String[] args) {
//        int square = 0;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                //1 1 1 2 13 14 15 21 22 23 24 25
//                square = square + 1;
//            }
//        }
//        System.out.println(square);
//    }
    public static void main(String[] args) {

        int[] FREQ = {1, 0, 7, 5, 4};
        int[] CUME;
        CUME = ComputerCumulativeSum(FREQ);

        System.out.println("CUME" + CUME);

        for (int i = 0; i < CUME.length; i++) {
            System.out.println(CUME[i] + "\t");
        }
    }

    public static int[] ComputerCumulativeSum(int[] freq) {
        int n = freq.length;
        int[] CUME = new int[n];

        CUME[0] = freq[0];

        for (int i = 1; i < n; i++) {
            CUME[i] = CUME[i - 1] + freq[i];
        }
        return CUME;

    }
    /**
     * 시험에서 등급 i를 배정받은 학생들의 수를 저장함
     * FREQ ={1,0,7,5,4}
     * CUME [1] = CUME [1-1] +FREQ[1] = 1 ;
     *
     * CUME (FREQ[0] + FREQ[1]+FREQ[2]+FREQ[3])
     * 차례대로 줄어드는걸보면 N-1 을 확인할수있음
     *
     * */
}
