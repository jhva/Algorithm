package org.example.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Number2751 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        int numberInt[] = new int[N];
//        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numberInt[i] += in.nextInt();
        }
        Arrays.sort(numberInt);
        for (int v : numberInt) {
            sb.append(v).append('\n');
        }
        System.out.println(sb);
    }
}
