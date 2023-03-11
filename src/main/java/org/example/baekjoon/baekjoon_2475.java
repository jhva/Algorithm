package org.example.baekjoon;

import java.util.Scanner;

public class baekjoon_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] * arr[i];
            sum += arr[i];
        }
        sc.close();
        System.out.println(sum % 10);
    }
}
