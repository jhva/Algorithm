package main.java.org.example.기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 부녀회장이될테야_2775 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[][] APT = new int[15][15];

        for (int i = 0; i < 15; i++) {
            APT[i][1] = i; // i층 1호
            APT[0][i] = i;// 0층 i호
        }

        for (int i = 1; i < 15; i++) { //14층까지
            for (int j = 2; j < 15; j++) { //15호 까지
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
//                [1][1]+[0][1]

            }
        }
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(APT[k][n]);

        }
    }
}
