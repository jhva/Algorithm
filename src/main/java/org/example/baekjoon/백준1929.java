package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 백준1929 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());


        boolean[] check = new boolean[N + 1];

        StringBuilder sb = new StringBuilder();

        check[0] = true;
        check[1] = true;

        for (int i = 2; i * i <= N; i++) {

            if (!check[i]) {
                for (int j = i * i; j <= N; j += i) {
//                소수의배수제외
                    check[j] = true;
                }

            }
        }

        for (int i = M; i <= N; i++) {
            if (!check[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}


/**
 * 에라토스테네스 에 체
 * 2부터 소수의 제곱과 그 이후 배수들을 제외해 나가는 방식
 */