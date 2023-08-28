package org.example.hacker.easy;

public class Kangaroo {

    public static void main(String[] args) {
        solve(0, 3, 4, 2);
    }

    static String solve(int x1, int v1, int x2, int v2) {
        String ans = "";
        boolean flag = true;
        while (flag) {
            x1 += v1;
            x2 += v2;
            if (x1 == x2) {
                ans = "YES";
                flag = false;
            }
            if (v2 >= v1 && x2 > x1) {
                flag = false;
                ans = "NO";
            }
            if (v1 >= v2 && x1 > x2) {
                flag = false;
                ans = "NO";
            }

        }
        return ans;

    }
}
