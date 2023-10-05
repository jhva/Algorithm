package org.example.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class level1자연수뒤집어배열로만들기 {

    public static void main(String[] args) {
        solve(123456);
    }

    static int[] solve(long n) {
//        if (n <= 10000000000L) return;
//        String str = String.valueOf(n);
//        int[] answer = Arrays.stream(Stream.of(str.split("")).sorted(Comparator.reverseOrder()).mapToInt(Integer::parseInt).toArray()).toArray();
//        System.out.println(Arrays.toString(Arrays.stream(answer).toArray()));
        String a = "" + n;
//        스트링 + int를 할경우 스트링으로 인식합니다
        int[] answer = new int[a.length()];

        int cnt = 0;
        while (n > 0) {
            System.out.println(answer[cnt]);
            System.out.println(n);

            answer[cnt] = (int) (n % 10);
            n /= 10;
            cnt++;
        }
        // 1) 12345 % 10 = 5
        // 2) 1234 % 10 = 4
        // 3) 123 % 10 = 3
        // 4) 12 % 10 = 2
        // 5) 1 % 10 = 1

        // 12345 = 1234
        // 1234 = 123
        // 123 = 12
        // 12 = 1
        //        // 1 = 0 ( 0.1 )
        return answer;

    }
}
