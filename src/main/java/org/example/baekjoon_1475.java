package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int[10]; // 0~9

        for (int i = 0; i < str.length(); i++) {
            int num = Character.getNumericValue(str.charAt(i)); // string 값 int 로 변경

            if (num == 6) {
                arr[9]++;
            } else {
                //입력받은값의 index ++
                arr[num]++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
            System.out.println(max + "max");
        }
        int nine = arr[9] / 2;
        System.out.println(nine + "nine");
        if (arr[9] % 2 == 1) {
            System.out.println("여기안탈텐데");
            nine++;
        }

        max = Math.max(max, nine);

        System.out.println(max + "result max ");
    }


    //9999
    //0 1 2 3 4 5 6 7 8 9
}
