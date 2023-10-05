package org.example.baekjoon;


import java.util.Scanner;
import java.util.Stack;

public class baekjoon_17928 {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        Stack<int[]> stack = new Stack<int[]>();
//        Stack<Integer> newStack = new Stack<>();
//        int temp;
//        for (int i = 1; i <= N; i++) {
//            temp = Integer.parseInt(st.nextToken());
//
//            while (!stack.isEmpty() && stack.peek()[0] > temp) {
////                newStack.push(-1);
//                stack.pop();
//                System.out.print(-1);
//            }
//            if (stack.peek()[0] < temp) {
//                System.out.print(temp);
//            }
//        }

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        int[] arr = new int[N]; //비교할값들

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }

            stack.push(i);
        }


        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);

    }
}
