package org.example.baekjoon;

import java.util.Scanner;

public class baekjoon_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();


        int[] arr = new int[26]; //알파벳 개수  - 26

        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - 97;
            arr[a]++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
