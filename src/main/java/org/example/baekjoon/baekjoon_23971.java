package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_23971 {

    static int answer;
    static int N;
    static int M;
    static int W;
    static int H;

    public static void main(String[] args) throws IOException {
        solve();
    }

    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int height = (H - 1) / (N + 1) + 1;
        int width = (W - 1) / (M + 1) + 1;
        answer = height * width;
        System.out.println(answer);

    }
}
