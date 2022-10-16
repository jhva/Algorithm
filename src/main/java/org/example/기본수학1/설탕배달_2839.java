package main.java.org.example.기본수학1;

import java.util.Scanner;

public class 설탕배달_2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int bongZi = 0;
        while (true) {
            //18
            if (N % 5 == 0) {
                //18/5 3
                bongZi += N / 5;
                break;
            } else {
                //N에서 -3 을 해준다는 생각을못함 .
                N -= 3;
                bongZi++;
            }
            if (N < 0) {
                System.out.println(-1);
                break;
            }
        }
        System.out.println(bongZi);

    }
}
