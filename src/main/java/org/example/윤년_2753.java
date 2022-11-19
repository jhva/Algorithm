package org.example;

import java.util.Scanner;

public class 윤년_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 4 == 0) {
            if (N % 400 == 0) System.out.println("1");

            else if (N % 100 == 0) System.out.println("0");
            else System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}


//100의 배수 400의 배수