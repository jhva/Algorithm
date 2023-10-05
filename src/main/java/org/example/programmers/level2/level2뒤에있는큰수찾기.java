package org.example.programmers.level2;

import java.util.Stack;

public class level2뒤에있는큰수찾기 {
    public static void main(String[] args) {
        solve(new int[] {2, 3, 3, 5});
    }

    static void solve(int[] numbers) {
        //각 원소들에 대해서 자신보다 뒤에있는 숫자 중에서 자신보다 크면서 가장 가까이있는 수
        Stack<Integer> stack = new Stack<>();

        int[] answer = new int[numbers.length];

        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }
    }
}
