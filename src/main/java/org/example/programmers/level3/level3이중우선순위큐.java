package org.example.programmers.level3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class level3이중우선순위큐 {

    static PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

    public static void main(String[] args) {
        solve(new String[] {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
    }

    static void solve(String[] operations) {
        int[] answer = new int[2];

        int maxValue;
        for (int i = 0; i < operations.length; i++) {
            String[] str = operations[i].split(" ");
            if (str[0].equals("I")) {
                maxHeap.add(Integer.valueOf(str[1]));

            } else if (str[0].equals("D") && str[1].equals("1")) {
                maxHeap.remove();

            } else if (str[0].equals("D") && str[1].equals("-1")) {
                minHeap.remove();
            }
        }

        System.out.println(Arrays.toString(answer));
    }

    static void insertQue(String insertQue) {

        // System.out.println(que);
    }
}
