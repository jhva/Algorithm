package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            //호텔의 층수
            //각 층의 방 수
            // 몇번재 손님
            int h = Integer.parseInt(st.nextToken());

            int w = Integer.parseInt(st.nextToken());
            //

            int N = Integer.parseInt(st.nextToken());


            //YXX YXXX 경우이기때문에
//
            int floor = N % h == 0 ? h * 100 : N % h * 100; //층

            /*
            보통의 경우 n/h+1 로 호수를 계산할 수 있지만, n/h가 딱 나누어 떨어지는 경우 실제 n/h 호이다.
            그렇기 때문에 n%h == 0 인 경우 n/h호로 하는 조건을 추가.
             */
            int room = N % h == 0 ? N / h : N / h + 1; //호수

            sb.append(floor + room).append("\n");

        }
        System.out.println(sb);

    }
}


//출력 N번째 손님에게 배정되어야 하는 방 번호를 출력한다.