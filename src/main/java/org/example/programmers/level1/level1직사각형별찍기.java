package org.example.programmers.level1;

import java.util.Scanner;

public class level1직사각형별찍기 {
    public static void main(String[] args) {
        solve();

    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();

        for(int i = 0; i <3; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
