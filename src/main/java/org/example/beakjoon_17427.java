package main.java.org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beakjoon_17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long answer = 0;


        for (int i = 1; i < n; i++) {
            answer += (long) (n / i) * i;
                // (n/ i) *i 는 1이 몇번 나오는지 계싼해줌
        }
        System.out.println(answer);

    }
}
