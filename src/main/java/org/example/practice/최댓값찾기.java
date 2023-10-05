package org.example.practice;

import java.util.Arrays;

public class 최댓값찾기 {
    public static void main(String[] args) {
        int[] intArray = {72, 54, 13, 25, 77, 34};
        int maxnum;
        maxnum = findMaxNum(intArray); // 배열을 넘긴다.
        System.out.println("최댓값 =" + maxnum);
    }

    public static int findMaxNum(int[] arr) {
        int i, max; // return max 선언
        //최대값을 첫번째 요소로정하기
        max = arr[0];
        //최대값을 두번째 요소부터 마지막 요소까지 차례대로 비교해보면서 구하고 ,
        for (i = 1; i < arr.length; i++) {
            // 비교한 요소가 최대값보다 크면 최대값을 그 요소로 바꿔보기
            //arr[0] 즉 72번을 토대로 1번부터 차례대로 인덱스마다 비교하면서넘김
            if (arr[i] > max) max = arr[i];
        }
        return max;

    }
}
