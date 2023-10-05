package org.example.programmers.level2;

import java.util.*;

public class level2더맵게 {
    static boolean[] visit;

    public static void main(String[] args) {
        solve(new int[] {1, 2, 3, 9, 10, 12}, 7);
    }

    static void solve(int[] scoville, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        int answer = 0;

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
        }

        while (priorityQueue.peek() < k) {
            if (priorityQueue.size() == 1)
                answer = -1;

            priorityQueue.add(priorityQueue.poll() + (priorityQueue.poll() * 2));
            answer++;
        }
        System.out.println(answer);
        // for (int i = 0; i < scoville.length; i++) {
        //     if (scoville[i] < k)
        //         len++;
        //
        // }
        // for (int i = 0; i < len; i++) {
        //
        //     int value = priorityQueue.peek() == null ? scoville[i] : scoville[i + 1];
        //     int sum = value + (priorityQueue.peek() == null ? scoville[i + 1] * 2 : priorityQueue.peek() * 2);
        //     priorityQueue.add(sum);
        //     answer++;
        //     if (value > k) {
        //         break;
        //     }
        //
        // }

    }

}
