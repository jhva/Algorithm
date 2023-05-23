package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class level2숫자변환하기 {


    public static void main(String[] args) {
        //x에 n 을 더함
        // x 에 2를 곱함
        // x에 3 을 곱함

        solve(10, 40, 30);
    }

    static void solve(int x, int y, int n) {
        if (x == y) {
            System.out.println(0);
        }
        int[] arr = new int[10000001];
        Queue<Integer> q = new LinkedList<>();
        q.add(x);

        while(!q.isEmpty()){
            int num = q.poll();
            int[] temp = new int[3];

            temp[0] = num + n;
            temp[1] = num * 2;
            temp[2] = num * 3;

            for(int i=0; i<3; i++){
                int next = temp[i];
                if(next>y){
                    continue;
                }
                if(arr[next] == 0 || arr[next] > arr[num]+1){
                    arr[next] = arr[num]+1;
                    q.add(next);
                }
            }

        }
        System.out.println(arr[y]);
    }


    //처음 접근했던풀이

    // static void solve(int x, int y, int n) {
    //     list = new ArrayList<>();
    //     for (int i = 0; i < 3; i++) {
    //
    //         dfs(i, x, y, n);
    //
    //     }
    //     int answer = list.size() == 0 ? -1 : Collections.min(list);
    //     System.out.println(answer);
    // }
    //
    // static void dfs(int i, int x, int y, int n) {
    //     if (x > y || n>y)
    //         return;
    //     if (i == 0) {
    //         if (x == y) {
    //             list.add(answer);
    //             answer = 0;
    //             return;
    //         }
    //         answer++;
    //         dfs(0, x + n, y, n);
    //     }
    //
    //     if (i == 1) {
    //         if (x == y) {
    //             list.add(answer);
    //             answer = 0;
    //             return;
    //         }
    //         answer++;
    //         dfs(i, x * 2, y, n);
    //     }
    //     if (i == 2) {
    //         if (x == y) {
    //             list.add(answer);
    //             answer = 0;
    //             return;
    //         }
    //         answer++;
    //         dfs(i, x * 3, y, n);
    //     }
    // }
}
