package org.example.hacker.easy;

public class Picking_numbers {
    public static void main(String[] args) {
        solve(new int[] {4, 6, 5, 3, 3, 1});
    }

    static void solve(int[] a) {
        int ans = 0;
        int[] arr = new int[100];
        for (int n : a) {
            arr[n]++;
        }
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sum = Math.max(sum, arr[i] + arr[i + 1]);
        }
        System.out.println(ans = sum);
        // 인덱스를 생각하며 풀었던거같다
        // 4 =1
        //6 =1
        //5= 1 , 3= 2 , 1=1
    }
}
