package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_11399 {
    public static void main(String[] args) throws IOException {
        solve();
    }

    static void solve() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ans);
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < ans.length; i++) {
            sum += ans[i];
            answer += sum;
        }
        System.out.println(answer);
    }
}
