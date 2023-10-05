package org.example.programmers.level2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class level2프로세스 {
    public static void main(String[] args) {
        int answer = solve(new int[] {2, 1, 3, 2}, 2);
        System.out.println(answer);
    }

    static int solve(int[] priorities, int location) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        int answer = 0;
        for (int i = 0; i < priorities.length; i++) {
            que.add(priorities[i]);
        }

        while (!que.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == que.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    que.poll();
                    answer++;
                }
            }
        }
        System.out.println(answer);
        if(que.size()>0){
            answer=-1;
        }
        return -1;

    }
}
