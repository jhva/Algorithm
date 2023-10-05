package org.example.programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class level2두큐합같게만들기 {

    static int sum = 0;

    public static void main(String[] args) {
        solve(new int[] {3, 2, 7, 2}, new int[] {4, 6, 5, 1});
    }

    static void solve(int[] queue1, int[] queue2) {
        int answer = 0;
        int length = queue1.length;
        long queue1Sum = 0; // queue1의 합계만을 사용할 것
        long totalSum = 0;
        long targetSum = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        queue1Sum = Arrays.stream(queue1).sum(); // 6

        totalSum = queue1Sum + Arrays.stream(queue2).sum(); // 20

        if (totalSum % 2 == 1)
            System.out.println(-1); // 똑같이 나눌 수 없다면 -1 리턴

        targetSum = totalSum / 2; // 10 // 하나의 큐만 절반 값을 맞춘다면 okay, 절반 값을 이용

        for (int i = 0; i < length; i++) {
            q1.offer(queue1[i]); // 1, 2, 1, 2
            q2.offer(queue2[i]); // 1, 10, 1, 2
        }

        int tempNum = 0;

        while (queue1Sum != targetSum) {

            if (queue1Sum < targetSum) {
                tempNum = q2.poll();
                q1.offer(tempNum);
                queue1Sum += tempNum;
            } else {
                tempNum = q1.poll();
                q2.offer(tempNum);
                queue1Sum -= tempNum;
            }

            answer++;

            // queue1, queue2의 모든 원소가 자리바꿈하여 다시 원래의 위치로 오기 위한 횟수 (queue1.length + queue2.length) * 2 = 16
            // 즉 16이 된다는 것은 다시 처음의 경우와 같아졌음을 의미하고, 더이상 반복할 필요가 없음을 뜻한다.
            if (answer > length * 4 - 1)
                System.out.println(-1);
        }

        System.out.println(answer);

    }

}
