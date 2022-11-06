package org.example.브루트포스;

import java.util.Scanner;


public class 덩치_7568번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();//몸무게
            arr[i][1] = sc.nextInt();//키
        }

        for (int i = 0; i < N; i++) {
            int rank = 1; //등수는 1로 맞추고
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                    //한명을 기준으로 모두를 돌며 몸무게와 키가
                }
            }
            System.out.print(rank + " ");
        }

    }
}

/**
 * 덩치와 키  두개의 값을 표현해서 등수를 매겨야함
 * 몸무게 x -> kg
 * 키가 y -> cm
 * 이때 이사람의 덩치는 (x,y)
 * (x,y)(p,q) A와 B의 덩치라할때
 * x>p y<q 이라하면 A의 덩치가 b의 덩치보다 더크다
 */