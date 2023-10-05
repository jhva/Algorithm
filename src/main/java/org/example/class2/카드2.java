package org.example.class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> qus = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            qus.add(i);
        }
        while (qus.size() > 1) {
            qus.poll();
            qus.offer(qus.poll());

        }
        System.out.println(qus.poll());
    }
}

//맨 앞의 수 삭제 Poll
//맨뒤에 삽입 offer
/*
1234

234
342
42
24
4

 */