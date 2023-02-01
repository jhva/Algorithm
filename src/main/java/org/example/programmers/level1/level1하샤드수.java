package org.example.programmers.level1;

public class level1하샤드수 {
    public static void main(String[] args) {
        int arr = 13;
        solve(arr);
    }

    static boolean solve(int x) {
        if (x < 1) {
            return false;
        }
        boolean answer = true;
        int sum = 0;
        String[] str = String.valueOf(x).split("");
        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);

            if (x % sum == 0) {
                answer = true;
            } else {
                answer = false;
            }
        }
        return answer;
    }
}
