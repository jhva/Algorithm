package main.java.org.example.Array;

import java.util.Arrays;

/**
 *삽입정렬
 *
 * 매 회전마다 현재 인덱스의 값이 왼쪽에 존재하는 인덱스 값보다
 * 작을경우 위치를 바꿔주며 정렬하는 방식
 */

public class insertSort {
    public static void main(String[] args) {
        int arrayNumber[] = new int[]{2, 10, 6, 15, 3};

        for (int i = 1; i < arrayNumber.length; i++) {

            //1~4
            for (int j = i; j > 0; j--) {
                // j =1 1>0 true 1
                if (arrayNumber[j - 1] > arrayNumber[j]) {
                    //0, 1, 2, 3, 4, arrayNumbep[0] arrayNumber0
                    int temp = arrayNumber[j - 1];
                    arrayNumber[j - 1] = arrayNumber[j];
                    arrayNumber[j] = temp;
                } else {
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arrayNumber));

    }
}
