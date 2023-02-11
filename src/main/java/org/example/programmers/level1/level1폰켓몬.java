package org.example.programmers.level1;

import java.util.*;

public class level1폰켓몬 {
    public static void main(String[] args) {
        solve(new int[]{3, 1, 2, 3});
    }

    static void solve(int[] arr) {
//1 ,2 3
        int answer = 0; //답
        int len = arr.length / 2;
        HashSet<Integer> list = new HashSet<Integer>();
        for (int arr3 : arr) {
            list.add(arr3);
        }
        if (list.size() > len) {
            answer = len;
        } else {
            answer = list.size();
        }
        System.out.println(answer);
    }
}
