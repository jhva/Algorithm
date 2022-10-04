package main.java.org.example;

import java.util.Scanner;

public class baekjoon_4375 {
    //n = 3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = 0;
            for (int i = 1; ; i++) {
                num = (num * 10) + 1;
                System.out.println(num+"첫번째 ");
                num = num % n;
                System.out.println(num+ "마지막 ");
                if (num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
