package org.example.one_more_practiceArray;

public class 선택정렬 {
    public static void main(String[] args) {
        int[] intArray = {11, 89, 45, 67, 92, 39, 74, 26, 90};
        int i;
        //정렬 전 배열 출력
        System.out.println("정렬 전 배열:");

        for (i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " ");
            //선택정렬 사용
            selectionSort(intArray);
            System.out.print("₩n정렬 후 배열");


        }
        for (i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int i, j, min, temp;
        int n = arr.length;

        for (i = 0; i < n - 1; i++) {
            // 
            //배열에서 최솟값 찾기
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static class 힙정렬 {
    }
}
