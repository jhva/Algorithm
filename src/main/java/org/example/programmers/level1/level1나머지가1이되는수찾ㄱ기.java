package org.example.programmers.level1;

import java.util.Arrays;

public class level1나머지가1이되는수찾ㄱ기 {
    public static void main(String[] args) {

        solve(12);
    }

    static int solve(int n) {
        int answer = 0;
        if(n<3){
            return answer;
        }
        int[] arr = new int[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (n % arr[i] == 1) {
                 answer = arr[i];
                 break;
            }
        }
        return answer;
    }
}
