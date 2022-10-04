package main.java.org.example;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // ex) 3 약수의 개수
        int[] arr = new int[count]; // arr[3]

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("정렬" + arr);
        //최대
        int max = arr[count - 1];
        System.out.println(max + "최대");
        //최소

        int min = arr[0];
        System.out.println(min + "최소");

        System.out.println(max * min);

    }
}
