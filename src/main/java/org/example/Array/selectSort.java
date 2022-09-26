package org.example.Array;

import java.util.Arrays;


/**
 * 선택정렬
 * <p>
 * 매 회전마다 인덱스를 탐색하여 최솟값을 처음부터 순서대로 집어넣는
 * 방식;
 */

public class selectSort {
    public static void main(String[] args) {
        int arrayNumber[] = new int[]{1, 2, 10, 6, 13};
        for (int i = 0; i < arrayNumber.length - 1; i++) {
            int mixmin = i; //최솟값
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (arrayNumber[i] > arrayNumber[j]) {
                    mixmin = j;
                }
            }
            int result = arrayNumber[i];
            arrayNumber[i] = arrayNumber[mixmin];
            arrayNumber[mixmin] = result;
        }
        System.out.println(Arrays.toString(arrayNumber));
    }

}