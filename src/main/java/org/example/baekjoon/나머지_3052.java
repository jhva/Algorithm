package org.example.baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class 나머지_3052 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int B = 42;
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//            arr[i] = arr[i] % 42;
//        }
//        System.out.println(Arrays.toString(arr));
//        sc.close();

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> hash = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hash.add(sc.nextInt() % 42);
        }
        sc.close();
//        System.out.println(hash.toString());
        System.out.println(hash.size());
    }
}
// hashset을 생각을못했다 ..
