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

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> defaultQue = new LinkedList<>();

        for (int i = 0; i < order.length; i++) {
            stack.add(i + 1);

            while (!stack.isEmpty()) {
                if (stack.peek() == order[cnt]) {
                    defaultQue.offer(stack.pop());
                    cnt++;
                } else
                    break;

            }
        }
        // System.out.println("보조 : " + 보조.toString());
        // System.out.println("기존 : " + 기존.toString());
        answer = defaultQue.size();
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


