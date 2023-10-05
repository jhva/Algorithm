package org.example.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1343 {
    public static void main(String[] args) throws IOException {
        solve();
    }

    static void solve() throws IOException {
        // Scanner sc = new Scanner(System.in);
        //
        // StringBuilder sb = new StringBuilder();
        // String input = sc.next();
        //
        // int findjum = input.indexOf('.');
        // System.out.println(findjum);
        //
        // boolean flag = true;
        // while (flag) {
        //     if (findjum == 2) {
        //         sb.append("B".repeat(2));
        //     } else if (findjum == 4) {
        //         sb.append("A".repeat(4));
        //     } else {
        //         flag = false;
        //     }
        //     if (findjum < input.length() || findjum > 4) {
        //         String st = input.substring(2, input.length() - 1);
        //         if (st.startsWith(".")) {
        //             sb.append(".");
        //             findjum++;
        //             flag = true;
        //         }
        //     } else {
        //         sb.append(-1);
        //         System.out.println(-1);
        //     }
        // }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String board = br.readLine();  //문자열

        board = board.replaceAll("XXXX", "AAAA");
        board = board.replaceAll("XX", "BB");

        if (board.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(board);
        }
    }
}
