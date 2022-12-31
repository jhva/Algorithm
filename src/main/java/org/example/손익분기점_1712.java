package main.java.org.example;

import java.util.Scanner;

public class 손익분기점_1712 {
    public static void main(String[] args) {
        //순수이익 C 노트북 의 가격 , B  가변 비용 A/(C-B)
        //가변비용이 노트북가격보다삐사게되면안댐

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (B >= C) {
            System.out.println("-1");
        } else {
            System.out.println(A / (C - B) + 1);
        }
    }
}
