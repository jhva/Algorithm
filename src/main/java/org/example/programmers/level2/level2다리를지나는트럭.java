package org.example.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class level2다리를지나는트럭 {
    public static void main(String[] args) {
        solve(2, 10, new int[] {7, 4, 5, 6});
    }

    static void solve(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        for (int t : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(t);
                    sum += t;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    sum -= q.poll();

                } else {
                    if (sum + t > weight) {
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
        }
    }
}
