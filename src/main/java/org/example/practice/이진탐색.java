package org.example.practice;

public class 이진탐색 {
//    public static void main(String[] args) {
//
//        int x = 17;
//        //x = 17 일때 예제
//        int[] binaryArray = {10, 12, 13, 14, 17, 20, 25, 37, 40, 46, 56};
//
//        int searchIndex = binaryArray(x, binaryArray);
//        System.out.println("searchIndex:" + searchIndex);
//    }
//
//    public static int binaryArray(int x, int[] binArr) {
//        //배열의 중간
//        int middleIndex = binArr.length / 2;
//        for (int i = middleIndex; i < binArr.length; i++) {
//            if (binArr[middleIndex] < x) {
//                    //
//            }
//        }
//
//    } // 내가 맨처음 풀었던 풀이

    public static void main(String[] args) {
        int[] searchArray = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 50};
        int x = 40; //내가 찾고싶은 숫자
        binarySearch(searchArray, x);


    }

    public static void binarySearch(int[] searchArray, int x) {
        int left = 0, right = searchArray.length - 1, middle;
        while (right >= left) {
            middle = (right + left) / 2;
            if (x == searchArray[middle]) {
                System.out.println(x + "키는 여기있다" + middle);
                break;
            }
            if (x < searchArray[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }
    }
}
/**
 * 크기가 n 이고 오름차순으로 정렬하여 배열 A에대한 탐색문제를 볼때
 * 배열 내의 요소들에 x가 있는지 탐색하기위해 오름차순으로 정렬되어있다느낫실
 * <p>
 * <p>
 * x 가 배열의 중간요소와 같으면 찾았으니 끝낸다 .
 * x 가 배열의 중간요소보다 작으면 앞쪽에 위치한 배열 반쪽에서 같은방법으로 x를 찾는다
 * <p>
 * x가 배열의 중간요소보다 크면 뒤쪽에 위치한 배열 반쪽에서 같은 방법으로 x를 찾는다
 */