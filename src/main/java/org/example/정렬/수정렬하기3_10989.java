package main.java.org.example.정렬;

import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 수정렬하기3_10989 {
    public static void main(String[] args) throws IOException {
        //시간초과때문에
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }
        Arrays.sort(arr); // array에 다담아준걸 sort후 다시 N만큼
        //돈 후 출력

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);

    }
}
