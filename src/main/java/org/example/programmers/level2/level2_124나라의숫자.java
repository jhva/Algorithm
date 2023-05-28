package org.example.programmers.level2;

public class level2_124나라의숫자 {
    public static void main(String[] args) {
        solve(4);
    }

    static void solve(int n) {

        String[] num = {"4", "1", "2"};
        String answer = "";
        int ans = n;

        while (ans > 0) {
            int index = ans % 3;
            ans /= 3;

            if (index == 0)
                ans--;

            answer = num[index] + answer;
        }

        System.out.println(answer);
    }
}
