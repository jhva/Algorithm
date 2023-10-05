package org.example.programmers.level1;

public class level1평균구하기 {
    public static void main(String[] args) {
        int[] arr = {5,5};

        solve(arr);
    }

    static double solve(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        if (ans / arr.length == 0) {
            return ans / arr.length;
        }
        return (double) ans/arr.length;
//        System.out.println((double) ans / arr.length);
//        if (ans / arr.length == 0) {
//            ans = ans / arr.length;
//        }
//        System.out.println((double) ans/arr.length);
//        answer = answer/arr.length;
//        System.out.println((double)ans/arr.length);
//        return 1.2;
    }
}
