package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon_2493 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> top = new Stack<>();


        for (int i = 1; i <= N; i++) {
            int input = Integer.parseInt(st.nextToken());

            while (!top.empty()) {
//                System.out.println(top.peek()[0] + "toppeek");
                if (top.peek()[1] < input) {
                    System.out.print(top.peek()[1] + "toppeek");

                    //가장앞의 탑이 input 작을때 이 탑한텐 신호를 보낼수없으므로 제거
                    top.pop();
                } else {
                    //  탑의 번호를 출력
                    System.out.print(top.peek()[0] + " ");
                    break;
                }
            }

            if (top.isEmpty()) {
                System.out.print("0 ");
            }
            top.push(new int[]{i, input});
        }

    }
}

