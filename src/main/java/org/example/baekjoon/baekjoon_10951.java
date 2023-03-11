package org.example.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class baekjoon_10951 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);

        }
        sc.close();

    }
}
