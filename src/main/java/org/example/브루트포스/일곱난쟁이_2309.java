package main.java.org.example.브루트포스;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
 * 아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 */
public class 일곱난쟁이_2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] initSum = new int[9];

        int sum = 0;
        for (int i = 0; i < initSum.length; i++) {
            initSum[i] = Integer.parseInt(br.readLine());  // 값들을 다 넣는다
            sum += initSum[i];//넣은 값들을 sum변수에 다 더해준다
        }

        int anonymous1 = 0;
        int anonymous2 = 0;

        for (int i = 0; i < initSum.length; i++) {
            for (int j = i + 1; j < initSum.length; j++) {
                if (sum - initSum[i] - initSum[j] == 100) {
                    anonymous1 = initSum[i];
                    anonymous2 = initSum[j];
                    break;
                }

            }
        }
        Arrays.sort(initSum);

        for (int i = 0; i < initSum.length; i++) {
            if (initSum[i] == anonymous1 || initSum[i] == anonymous2)
                continue;
            System.out.println(initSum[i]);

        }


    }
}
