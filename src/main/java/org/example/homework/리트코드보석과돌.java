package org.example.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 리트코드보석과돌 {

    public static void main(String[] args) {
        solve("aA", "aAAbbbb");
    }

    /**
     * 첫번째 문자열인 jewels인 각 문자가 두번째 문자열인 stones 의 몇 개 포함되어 있는지 계산하는 문제
     *
     * 조건 jewels는 중복된 문자는 존재할수없다
     *
     *
     * l 입력: jewels = "aA", stones = "aAAbbbb"
     * l 출력: 3
     *
     * 입출력 예2
     * l 입력: jewels = "z", stones = "ZZ"
     *
     * 출력: 0
     *
     *
     */
    static void solve(String jewels, String stones) {
        int answer = 0; // 문제의 답을 표출

        String[] jewelsArr = jewels.split(""); // jewels라는 문자열이 stones배열에 포함되어있는지 구분하기위해서

        String[] stonesArr = stones.split("");// 구분하기위해서는 다 쪼개야함 .
        Set<String> setJewels = new HashSet<>(List.of(jewelsArr));
        /**
         *  Set을 선언한이유는 문제에서  중복된 문자는 존재하지않는다고하여 Set을 생성과 동시에 List형태로 변환후 넣어주었다 .
         *  List.of를 선언한이유는 HashSet은 Collection으로 받기때문에 List.of를 사용함.
         *
         *  Collection은 List와 Set의 최상위 구현체이기때문에 .
         */
//        System.out.println(setJewels);



        for (int i = 0; i < stonesArr.length; i++) {

            /**
             *
             * 앞 서 쪼갠 stones배열을 순회하면서
             *
             * setJewels에 stones배열의 요소가 포함되어있으면 정답개수를 하나씩 더해주고
             *
             * 포함되어있지않더라면 건너뛴다.
             *
             */
            if (setJewels.contains(stonesArr[i])) answer++;
            else continue;
        }
        System.out.println(answer);




    }
}
