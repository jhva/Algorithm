package org.example.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class level2호텔대실 {
    public static void main(String[] args) {
        // String[][] st = new String[][] {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"},
        //     {"18:20", "21:20"}};
        String[][] st = new String[][] {{"09:10", "10:10"}, {"10:20", "12:20"}};
        solve(st);
    }

    static void solve(String[][] book_time) {
        PriorityQueue<Integer> quein = new PriorityQueue<>();
        PriorityQueue<Integer> queout = new PriorityQueue<>();
        int answer = 0, cnt = 1;
        for (String[] time : book_time) {
            quein.offer(helper(time[0]));
            queout.offer(helper(time[1]) + 10);
            System.out.println(time[1]);
        }
        while (!queout.isEmpty() && !quein.isEmpty()) {
            int o = queout.poll();
            cnt--;
            while (!quein.isEmpty() && quein.peek() < o) {
                quein.poll();
                cnt++;
            }
            answer = Math.max(answer, cnt);
        }

    }

    public static int helper(String str) {
        String[] s = str.split(":");
        return Integer.valueOf(s[1]) + Integer.valueOf(s[0]) * 60;
    }

}
