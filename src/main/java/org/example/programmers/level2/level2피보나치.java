package org.example.programmers.level2;

public class level2피보나치 {
    public static void main(String[] args) {
        solve(3);
    }

    static void solve(int n) {

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] % 1234567;
        }
        System.out.println(arr[n]);


    }

//    public static int recurison(int n) { // 시간초과
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return recurison(n - 1) + recurison(n - 2);
//    }
}
