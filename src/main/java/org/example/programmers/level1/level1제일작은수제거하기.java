package org.example.programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

/*
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
 */
public class level1제일작은수제거하기 {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 3, 2, 1};
        solve(arr);

    }

    static int[] solve(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        list.remove(Collections.min(list));
        answer = new int[arr.length - 1]; //가장작은수하나는 무조건 없어지니가

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
//        int value = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            answer = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder())
//                    .mapToInt(Integer::intValue).
//                    filter(v -> v > value).toArray();
//
//        }
//        System.out.println(Arrays.toString(answer));
//        return answer;

        //이게 왜 안되었을까 ?
    }
}
