package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_2667 {

    static int[][] map;
    static int[] dx = {-1, 1, 0, 0}; //x방향배열-상하
    static int[] dy = {0, 0, -1, 1}; //y방향배열-좌우
    static boolean[][] visit;

    static int N;
    static ArrayList<Integer> result;

    static int count;

    public static void main(String[] args) throws IOException {
        solve();
    }

    static void solve() throws IOException {

        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();

        map = new int[N][N];
        visit= new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < N; j++) {

                map[i][j] = s.charAt(j) - '0';
            }
        }

        count = 0;

        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    count = 1;
                    search(i, j);
                    result.add(count);

                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());

        for (int c : result) {
            System.out.println(c);
        }


    }

    static int search(int x, int y) {
        visit[x][y]=true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];


            if(nx>=0 && ny>0 && nx<N && ny<N){
                if(map[nx][ny]==1 && !visit[nx][ny]){
                    search(nx,ny);
                    count++;
                }
            }

        }

        return count;
    }

}
