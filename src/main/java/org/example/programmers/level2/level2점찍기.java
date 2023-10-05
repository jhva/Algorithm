package org.example.programmers.level2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class level2점찍기 {
    public static void main(String[] args) {
        solve(1, 5);
    }

    static void solve(int k, int d) {

        // int ans =1;
        // Queue<int[][]> q = new LinkedList<>();
        //
        // q.add(new int[][] {{0, 0}});
        // ans++;
        //
        // int index=0;
        // while (!q.isEmpty()) {
        //     int[][] a = q.poll();
        //
        //     int v1 = a[0][0];
        //     int v2 = a[0][1];
        //
        //     if (v1 == d && v2 == 0)
        //         break;
        //
        //     if (v1 + v2 == d) {
        //         v2 = 0;
        //         v1 += k;
        //     } else {
        //         v2 += k;
        //     }
        //     ans++;
        //     q.add(new int[][] {{v1, v2}});
        // }


        // System.out.println(ans);


        //하 원의방정식으로 풀어야하네
    }
}
