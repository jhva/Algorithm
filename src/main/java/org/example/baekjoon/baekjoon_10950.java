package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A + B);
        }
    }
}
