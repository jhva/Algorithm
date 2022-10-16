package main.java.org.example.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 설탕배달_2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int bongZi = 0;


        while (true) {
            //18
            if (N % 5 == 0) {
                //18/5 3
                bongZi += N / 5;
                System.out.println(bongZi);
                break;
            } else {
                //N에서 -3 을 해준다는 생각을못함 .
                N -= 3;
                bongZi++;
            }
            if (N < 0) {
                System.out.println("-1");
                break;
            }
        }
    }
}
