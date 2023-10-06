package org.example.hacker.easy;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        solve(20, 23, 6);
    }

    static void solve(int i, int j, int k) {

        int ans = 0;

        while (i <= j) {

            String[] str = String.valueOf(i).split("");

            String temp = "";
            for (int day = str.length - 1; day >= 0; day--) {
                temp += str[day];
            }
            int result = Math.abs(i - Integer.parseInt(temp));
            if (result % k == 0) {
                ans++;
            }

            i++;
        }
        System.out.println(ans);

    }
}
