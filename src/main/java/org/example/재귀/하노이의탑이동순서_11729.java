package org.example.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class 하노이의탑이동순서_11729 {

    static StringBuffer sb;
    static int count = 0;

    private static void move(int from, int use, int to, int N) {
        if (N == 1) {
            count++;
            sb.append(from + " " + to).append('\n');
            return;
        }

        move(from, to, use, N - 1); //
        sb.append(from + " " + to).append('\n');
        count++;
        move(use, from, to, N - 1); //
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuffer();


        int N = Integer.parseInt(br.readLine());
        move(1, 2, 3, N); // 원판의 개수 , 현재타워번호, 목표타워 번호 ,서브타워 번호;
        System.out.println(count);
        System.out.println(sb);
    }


}
