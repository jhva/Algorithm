package org.example.브루트포스;

import java.util.Scanner;

public class 영화감독_1436번 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        while (N > 0) {
//  18String
            cnt++;
            String s = Integer.toString(cnt);
            if (s.contains("666")) {
                N--;
            }
        }
        System.out.println(cnt);
    }
}

/**
 * 어떤 수 에 6이 적어도 3개이상 연속으로 들어가는 수 1666, 2666,3666,4666,,,
 * N번째 영화의 제목은 (N번째로 작은 숫자 )
 */