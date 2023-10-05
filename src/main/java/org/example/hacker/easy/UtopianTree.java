package org.example.hacker.easy;

public class UtopianTree {
    public static void main(String[] args) {
        solve(5);
    }

    static void solve(int n) {
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                ans *= 2;
                continue;
            }
            ans++;
        }

        System.out.println(ans);

    }
}
