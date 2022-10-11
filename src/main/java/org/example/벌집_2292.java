package main.java.org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 벌집_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int coount = 1; //
        int sum = 1;


        if (N == 1) {
            System.out.println(1);

        } else {
            while (sum < N) {
                sum += 6 * coount;
                coount++;
            }
            System.out.println(coount);

        }

    }
}
