package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class level2택배상자 {
    public static void main(String[] args) {
        solve(new int[] {4, 3, 1, 2, 5});
    }

    static void solve(int[] order) {
        int answer = 0;
        int cnt = 0;

        Stack<Integer> 보조 = new Stack<>();
        Queue<Integer> 기존 = new LinkedList<>();

        for (int i = 0; i < order.length; i++) {
            보조.add(i + 1);

            while (!보조.isEmpty()) {
                if (보조.peek() == order[cnt]) {
                    기존.offer(보조.pop());
                    cnt++;
                } else
                    break;

            }
        }
        // System.out.println("보조 : " + 보조.toString());
        // System.out.println("기존 : " + 기존.toString());
        answer = 기존.size();
    }

        // Stack<Integer> sub = new Stack<>();
        // Queue<Integer> que = new LinkedList<>();
        //
        // int ans = 0;
        //
        // int select = 0;
        // for (int i = 0; i < order.length; i++) {
        //     que.add(i + 1);
        // }
        //
        // while (true) {
        //     boolean flag = false;
        //
        //     if (!que.isEmpty() && order[select] == que.peek()) {
        //         que.poll();
        //         ans++;
        //         select++;
        //         flag=true;
        //         continue;
        //     }
        //
        //     if(!sub.isEmpty() && order[select] ==sub.peek()){
        //         sub.pop();
        //         ans++;
        //         select++;
        //         flag=true;
        //         continue;
        //     }
        //     if(!que.isEmpty()){
        //         sub.add(que.poll());
        //         flag=true;
        //     }
        //     if(!flag){
        //         break;
        //     }
        // }
        // System.out.println(ans);
    }


    //best


