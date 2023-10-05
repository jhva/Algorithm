package org.example.programmers.level3;

public class level3징검다리건너기 {
    public static void main(String[] args) {
        solve(new int[] {2, 4, 5, 3, 2, 1, 4, 2, 5, 1}, 3);
    }

    static void solve(int[] stones, int k) {
        int answer = 0;

        int howMany = 0;
        int mid;
        int max = Integer.MAX_VALUE;

        while (howMany <= max) {
            mid = (max + howMany) / 2;

            if (isOk(stones, mid, k)) {
                answer = mid;

                howMany = mid + 1;
            } else
                max = mid - 1;
        }

        System.out.println(answer);
    }

   static boolean isOk(int[] stones, int max, int k) {
        int cnt = 0;
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] < max)
                cnt++;
            else
                cnt = 0;

            if (cnt >= k)
                return false;
        }
        return true;
    }
}
