package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class level2k진수에서소수개수구하기 {
    public static void main(String[] args) {
        solve(437674, 3);
    }

    static void solve(int n, int k) {
        int answer = 0;

        String convertor = Integer.toString(n, k); // 변환

        List<String> list = new ArrayList<>(List.of(convertor.split("0"))); // 0 만 다 짤르기

        for (String s : list) {
            if (s.equals(""))
                continue;

            long checkNum = Long.parseLong(s);

            if (isPrime(checkNum))
                answer++;
        }

    }

    static boolean isPrime(Long checkNum){
        if (checkNum == 1) return false;
        System.out.println(Math.sqrt(checkNum));
        for (int i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) return false;

        }
        return true;
    }
}
