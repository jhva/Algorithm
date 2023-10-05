package org.example.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬수_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            //            int temp = sc.nextInt();
//            if (temp == 0) {
//                break;
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = sc.nextInt(Integer.parseInt(new StringBuilder().reverse().toString()));
//            }
//            System.out.println(Arrays.toString(arr));
            String s = br.readLine();
            if (s.equals("0")) {
                break;
            }

            String reverse = new StringBuilder(s).reverse().toString();
            if (s.equals(reverse)) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }


}
