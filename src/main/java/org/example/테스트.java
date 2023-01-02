package org.example;

import java.util.Arrays;

public class 테스트 {

    public static void main(String[] args) {
        int N = 2;
        boolean[] arr = new boolean[N];
        int cnt = 0;
        boolean check = true;

        arr[0] = true;
        arr[1] = true;
        if (N != 2) {
            for (int i = 2; i * i < N; i++) {
                for (int j = i * i; j <= N; j += i) {
                    if (!arr[i]) {
                        arr[j] = true;
                    }
                }
            }
        } else {
            arr[1] = false;
        }
        for (int i = 0; i < N; i++) {
            if (!arr[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}


//2 3 4 6  9