package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number2751 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);
        for (int  v : list) {
            sb.append(v).append('\n');

        }
        System.out.println(sb);
    }
}
