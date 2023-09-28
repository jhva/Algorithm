package org.example.hacker.easy;

import java.util.Arrays;

public class ElectronicsShop {
    public static void main(String[] args) {
        solve(new int[] {3, 1}, new int[] {5, 2, 8}, 10);
    }

    static void solve(int[] keyboards, int[] drives, int b) {
        int ans = 0;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int max = 0;

        for (int i = keyboards.length - 1; i >= 0; i--) {
            int keyboard = keyboards[i];
            for (int j = drives.length - 1; j >= 0; j--) {
                int drive = drives[j];
                int sum = keyboard + drive;
                if (keyboard >= b || drive >= b)
                    continue;
                if (sum > b)
                    continue;
                max = Math.max(sum, max);
            }
        }

        ans = max == 0 ? -1 : max;

        System.out.println(ans);

    }
}
