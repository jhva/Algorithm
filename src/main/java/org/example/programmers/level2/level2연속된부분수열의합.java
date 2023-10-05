package org.example.programmers.level2;

import java.util.Arrays;
import java.util.List;

public class level2연속된부분수열의합 {
    public static void main(String[] args) {
        solve(new int[] {1, 2, 3, 4, 5}, 7);
    }

    static void solve(int[] sequence, int k) {
        int[] answer = new int[2];

        int n = sequence.length;
        int left = 0, right = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;

        while (true) {
            if (sum >= k) {
                sum -= sequence[left++];
            } else if (right >= n)
                break;
            else if (sum < k) {
                sum += sequence[right++];
            }

            if (sum == k) {
                if (right - left < len) {
                    answer[0] = left;
                    answer[1] = right - 1;
                    len = right - left;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

    }
}
