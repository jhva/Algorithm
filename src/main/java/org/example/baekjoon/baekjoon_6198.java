package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long cnt = 0;

        int temp;

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < N; i++) {
            temp = Integer.parseInt(br.readLine());

            //해당 건물높이보다 같거나 작으면 삭제해서 처리함

            while (!stack.isEmpty() && stack.peek() <= temp) {
                stack.pop();
            }
            cnt += stack.size();
            stack.push(temp);
        }
        System.out.println(cnt);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//
//
//        Stack<int[]> stack = new Stack<>();
//        long cnt = 0;
//
//
//        for (int i = 0; i < N; i++) {
//            int number = Integer.parseInt(br.readLine());
//            while (!stack.empty()) {
//
//                if (stack.peek()[0] > number) {
//                    stack.pop();
//                } else {
//                    cnt++;
//                    break;
//                }
//            }
//
//            stack.push(new int[]{i, number});
//        }
//        System.out.println(cnt);

    }
}
