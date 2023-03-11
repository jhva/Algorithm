package org.example.baekjoon;

import java.util.Scanner;

public class 알파벳찾기_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; //알바벳 26
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

    public static class baekjoon_10952 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                System.out.println(A + B);
                if(A==0 && B==0) {
                    sc.close();
                    break;
                }
                System.out.println(A+B);
            }
        }
    }

    public static class 숫자의합_11720 {
        public static void main(String[] args) {

        }
    }
}
