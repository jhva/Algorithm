package main.java.org.example;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 1
 * 10
 * 13
 * 100
 * 1000
 * 10000
 * 100000
 * 0
 * 예제 출력 1
 * 1 1
 * 10  4~10*2 20  10 ~ <= 20         11 13  17 19 4
 * 13   13 ~ 26                            17 19 23   3
 * 21
 * 135
 * 1033
 * 8392
 */

public class 베르트랑공준_4948 {
    //n <N <= 2n
    //입력에 마지막엔 0 이 주어짐

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean arr[] = new boolean[246913];
        // 1<=N <= 123,456 이여서 *2
        //

        while (true) {
            int cnt = 0;

            int N = sc.nextInt();
            if (N == 0) {
                break;
            } else {
                int max = N * 2;

                for (int i = 2; i <= max; i++) {
                    arr[i] = true;
                    //처음 모든 array를 true로 2부터 20
                    //까지 true
                }

                for (int i = 2; i <= max; i++) {
                    // 2의배수..3의배수.. 2<21  j = i*2 j=j+2
                    for (int j = i * i; j <= max; j = j + i) {
                        if (arr[j] == true) {
                            arr[j] = false;
                            //배수지움
                        }
                    }
                }
                for (int k = N + 1; k <= max; k++) {
                    //문제풀이 1<= N <= 123,456 K=N+1 2N
                    if (arr[k] == true) {
                        cnt++;
                    }
                }
                System.out.println(cnt);

            }
        }
        sc.close();

    }

}
