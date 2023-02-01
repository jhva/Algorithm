package org.example.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class level1정수내림차순으로배치하기 {

    public static void main(String[] args) {
        long cnt = 118372;
        solve(cnt);
    }

    static void solve(long num) {
        long answer = 0;
        String[] str = Long.toString(num).split("");
        String streamValue = Stream.of(str).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        answer = Long.parseLong(streamValue);
//        System.out.println(answer);
    }
}
