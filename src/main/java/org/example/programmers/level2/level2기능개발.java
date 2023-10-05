package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class level2기능개발 {
    public static void main(String[] args) {

        solve(new int[] {93, 30, 55}, new int[] {1, 30, 5});
    }

    static void solve(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int work = 100 - progresses[i];

            if (work % speeds[i] == 0) {
                que.add(work / speeds[i]);
            } else {
                que.add(work / speeds[i] + 1);
            }
        }

        while (!que.isEmpty()) {
            int cnt = 1;
            int day = que.poll();

            while (!que.isEmpty() && day >= que.peek()) {
                cnt++;

                que.poll();
            }

            list.add(cnt);
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i <answer.length; i++) {
            answer[i]=list.get(i);
        }

        System.out.println(Arrays.toString(answer));

    }
}
