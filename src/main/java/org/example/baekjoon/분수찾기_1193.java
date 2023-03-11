package org.example.baekjoon;

import java.util.Scanner;

public class 분수찾기_1193 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //x

        int line = 1;
        int count = 0;

        while (true) {
            if (count + line >= n) {
                break;
            }
            //1 2
            count += line;
            line++;
        }

        int th = n - count;

        if (line % 2 == 0) {
            System.out.println(th + "/" + (line - th + 1));
        }
        System.out.println((line - th + 1) + "/" + th);


    }


}
