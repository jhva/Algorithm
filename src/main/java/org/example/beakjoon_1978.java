package main.java.org.example;

import java.util.Scanner;

public class beakjoon_1978 {
    public static void main(String[] args) {
        //출력 4
        //입력 1 3, 5, 7
        Scanner sc = new Scanner(System.in); //몊개 받을지
        int a = sc.nextInt();
        int[] num = new int[a];
        int count = 0; //몇개나 있는지


        for (int i = 0; i < a; i++) {
            int input = sc.nextInt(); //배열안
            if (input == 1) continue;
            if (checkPrim(input)) {
                count++;
            }

        }
        System.out.println(count);

    }

    public static Boolean checkPrim(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }
}
