package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            LinkedList<int[]> q = new LinkedList<>();


            for (int i = 0; i < N; i++) {
                q.offer(new int[]{i, sc.nextInt()});
            }
            int count = 0;

            while (!q.isEmpty()) {
                //맨 앞줄 원소
                int[] front = q.poll();

                boolean check = true; // front 가 가장 큰원소인지 판별하는 변수

                for (int i = 0; i < q.size(); i++) {
                    if (front[1] < q.get(i)[1]) {
                        //큐에있는 i번째 원소가 중요도가클경우 (첫번째 원소보다 )

                        //뽑은 원소 를 i이전의 원소들을 뒤로 보낸다
                        q.offer(front);
                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }


                        //front 원소가 가장 큰원소가 아니여서 false
                        check = false;
                        break;
                    }
                }

                //다음반복문
                if (check == false) {
                    continue;
                }

                count++;


                if (front[0] == M) {
                    //찾고자 하는 문서라면 해당 테스트케이스 조룡ㅇ
                    break;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);


    }
}
