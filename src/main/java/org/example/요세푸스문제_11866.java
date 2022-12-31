package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (que.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                int value = que.poll(); // k-1 번 째까지  꺼내와서 뒤에 넣어줌
                que.offer(value);

            }

            sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll()).append('>');
        System.out.println(sb);
    }
}


//ㅁ나중에들어온사람이먼저나가고 /// 스택
// 먼저들어온사람이 먼저나간다 // 큐


//