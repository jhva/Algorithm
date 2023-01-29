package org.example.programmers.level1;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class level1자릿수더하기 {
    public static void main(String[] args) {
        solve(987);
    }

    static void solve(int num) {
        String str= String.valueOf(num);

        int [] arr = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println((Arrays.stream(arr).sum()));

    }
}
