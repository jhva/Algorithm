package org.example.hacker.easy;

public class DrawingBook {
    public static void main(String[] args) {
        solve(6, 2);
    }

    static void solve(int n, int p) {
        //p/2 양방향 이니까 /2
        // 원하는페이지 - 마지막페이지 거꾸로돌때
        int ans = (int)Math.min(p / 2, Math.floor(n / 2) - Math.floor(p / 2));
        System.out.println(ans);

    }
}
