//package main.java.org.example;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class tesat {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] str = br.readLine().split(" ");
//        int min = Integer.parseInt(str[0]);
//        int max = Integer.parseInt(str[1]);
//        StringBuilder sb = new StringBuilder();
//
//        boolean[] nbox = new boolean[max + 1];
//        nbox[0] = nbox[1] = true;
//
//
//        for (int i = 2; i <= Math.sqrt(nbox.length); i++) {
//            System.out.println(i + "첫번째 for문 ");
//            if (nbox[i]) continue;    //이미 소수로 판별되었으면 아래 FOR문을 생략
//            for (int j = i * i; j < nbox.length; j += i) {
//                System.out.println(j += i);
//                System.out.println(j);
//                System.out.println(Math.sqrt(nbox.length));
////배수값을 TRUE로 바꾸어 소수에서 제외
//                nbox[j] = true;
//            }
//
//
//        }
//        System.out.println(nbox);
//    }
//}
//
