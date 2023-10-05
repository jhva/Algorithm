package org.example.programmers.level1;

import java.util.Arrays;


public class level1진법뒤집기 {
    public static void main(String[] args) {
        solve(45);
    }

    static void solve(int n) {
        int answer = 0;
        String str = "";
// 3을 계속 나눈 나머지
        while (n != 0) {
            str += n % 3;
            n /= 3;
            //3을 나눈 몫을 다시 n 반복
            //n 이 저장되면서 계속 반복
        }
        //끝나면 str은 0 00 002 0021
        //parseInt 로 3진법으로 변환
        System.out.println(Integer.parseInt(str, 3));

    }
}
