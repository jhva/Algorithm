package org.example.programmers.level1;

import java.util.*;

public class level1나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 7, 10};
        int divisor = 5;
        solve(arr, divisor);
    }

    static int[] solve(int[] arr, int divisor) {

//        int[] answer = {};
//        HashSet<Integer> hashset = new HashSet<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % divisor == 0) {
//                hashset.removeIf(n -> (n == -1));
//                hashset.add(arr[i]);
//            } else {
//                hashset.add(-1);
//            }
//        }
//        answer = new int[hashset.size()];
//        answer = hashset.stream().mapToInt(i -> i).toArray();
//        return answer;

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }
//
        int[] answer = new int[cnt];
        cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                answer[cnt]=arr[i];
                cnt++;
            }
        }

        Arrays.sort(answer);

        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
