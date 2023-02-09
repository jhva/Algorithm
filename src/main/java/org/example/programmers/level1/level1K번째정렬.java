package org.example.programmers.level1;

import java.lang.reflect.Array;
import java.util.*;


/**
 * 열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 * <p>
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 * <p>
 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * 2에서 나온 배열의 3번째 숫자는 5입니다.
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때
 * , commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아
 * return 하도록 solution 함수를 작성해주세요.
 * <p>
 * 제한사항
 * array의 길이는 1 이상 100 이하입니다.
 * array의 각 원소는 1 이상 100 이하입니다.
 * commands의 길이는 1 이상 50 이하입니다.
 * commands의 각 원소는 길이가 3입니다.
 * 입출력 예
 * array	commands	return
 * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 * 입출력 예 설명
 * [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 * <p>
 * 출처
 * 1,2,3,4,5,6,7
 */

public class level1K번째정렬 {

    static List<Integer> answer = new ArrayList<>();
    static int[] slice = {};

    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }


    static void solution(int[] arr1, int[][] arr2) {
        int[] answer = new int[arr2.length]; //길이가 3이라고 나와있고 .

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = arr2[i][0]; j <= arr2[i][1]; j++) {
//                각 행에 [i][0]~[i][1]째까지 구해야하고 .
//                System.out.println(arr1[j-1]);  정렬 전 1번째는 5
                list.add(arr1[j - 1]);
                Collections.sort(list);
                // 2~ 5 4~4 1 ~7
                // 2-5 끝나면 아래구문
            }
            System.out.println(arr2[i][2]);
            //arr2[i][2] = 마지막 숫 자값 3, 1, 3
//            System.out.println(list); 찍어보면 2 3 5 6
            // 3 -1
            // 답넣기
            answer[i] = list.get(arr2[i][2] - 1);
            //첫 구문 끝나면 clear clear clear
            list.clear();

        }

        System.out.println(Arrays.toString(answer));


//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(i);
//            int startArr2 = arr2[i][0];
//            int midArr2 = arr2[i][1];
//            int endArr2 = arr2[i][2];
////
//            Arrays.sort(arr1);
//
//            int[] arr = Arrays.copyOfRange(arr1, startArr2, midArr2 + 1);
////sout
//            Arrays.sort(arr);
//            answer[i] = arr[endArr2];
////            answer = new int[arr.length + 1];
////            answer[i] = arr[i];
////            System.out.println(Arrays.toString(arr));
//
//        }
//        System.out.println(Arrays.toString(answer));

//        while (index < arr2.length) {
//            for (int i = 0; i < arr2.length; i++) {
////                System.out.println(arr2[i][0]);
//                int startArr2 = arr2[i][0];
//                int midArr2 = arr2[i][1];
//                int endArr2 = arr2[i][2];
//
//                Arrays.sort(arr1);
//                for (int k = 0; k < arr1.length; k++) {
//                    int val = 1;
//                    for (int j = startArr2; j < midArr2; j++) {
//
//                        System.out.println(arr1[j]);
//
//                    }
////
//                }
////                int answerInt = list.get(endArr2);
//
////                answer[i] = answerInt;
//                index++;
//            }


//        System.out.println(Arrays.toString(answer));
//        slice = new int[arr2.length];
//        for (int i = 0; i < arr2[0].length; i++) {
//            int first = arr2[i][0];
//            for (int j = 0; j < arr2[i].length; j++) {
//                for (int k = 0; k < arr2[j].length; k++) {
//                    System.out.println(arr2[j][2]);
//                    check(arr1, first, arr2[i][1], arr2[j][2]);
//
//                }
//            }
//        }
//        System.out.println(Arrays.toString(slice));
//        System.out.println(answer);

//        System.out.println(list);

    }

//    static void check(int[] arr, int num, int num2, int last) {
//
//        int index = num;
//        while (index < num2) {
//            for (int i = 0; i < arr.length; i++) {
//                int temp = 0;
//                answer.add(arr[index]);
//
////                if (arr[i] == arr[index]) {
////                    answer[i] = arr[index];
////
////                }
//            }
//
//            index++;
//
//        }
//        System.out.println(Arrays.toString(intarr));
}

