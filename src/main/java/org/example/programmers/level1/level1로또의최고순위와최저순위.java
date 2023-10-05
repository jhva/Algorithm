package org.example.programmers.level1;

import java.util.*;

public class level1로또의최고순위와최저순위 {
    public static void main(String[] args) {
        solve(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
    }

    static void solve(int[] lottos, int[] win_nums) {
//        Arrays.sort(lottos);
//        Arrays.sort(win_nums);
//        int temp1 = 0;
//        int temp2 = 0;
//        for (int i = 0; i < lottos.length; i++) {
//            int index = 0;
//            if (lottos[i] == 0) {
//                lottos[i] = win_nums[i];
////                continue;
//                while (index < lottos.length) {
//                    if (lottos[i] == lottos[index]) {
//                        lottos[i] = win_nums[i + 1];
//                    }
//                    index++;
//                }
//            }
//            for (int j = 0; j < win_nums.length; j++) {
//                if (lottos[i] == win_nums[j]) {
//                    temp1++;
//                }
//            }
//
//        }
//
//        System.out.println(temp1);    하나하나 구할려고했던 코드 ;; 잘못생각한코드 ..

        // 최저와 최고 "순위" 만 찾아야한다
        int[] answer = new int[2];

        int zero = 0;
        int current = 0;

        int[] rank = {6, 6, 5, 4, 3, 2, 1}; // 6 이 두개인이유는 0개맞춘사람과 1개맞춘사람은 6등이니까 이렇게표시함


        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == 0) {//로 또 용지 가 안보일경우
                    zero++;
                    break;
                }

                if (lottos[i] == win_nums[j]) {
                    //로또번호 와 가틍ㄹ경욱ㄹ경우
                    current++;
                    break;
                }
            }
        }

        answer[0] = rank[zero + current];
        answer[1] = rank[current];

//        System.out.println(Arrays.toString(lottos));
//        System.out.println(Arrays.toString(win_nums));

    }
}

/**
 * 로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다.
 * 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다.
 * 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
 * 알아볼 수 없는 번호를 0으로 표기하기로 하고,
 * 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고 가정해보겠습니다.
 * 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면,
 * 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.
 * <p>
 * <p>
 * <p>
 * 당첨 번호	    31	10	45	1	6	19	결과
 * 최고 순위 번호	31	0→10	44	1	0→6	25	4개 번호 일치, 3등
 * 최저 순위 번호	31	0→11	44	1	0→7	25	2개 번호 일치, 5등
 * 순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다.
 * 알아볼 수 없는 두 개의 번호를 각각 10, 6이라고 가정하면 3등에 당첨될 수 있습니다.
 * 3등을 만드는 다른 방법들도 존재합니다. 하지만, 2등 이상으로 만드는 것은 불가능합니다.
 * 알아볼 수 없는 두 개의 번호를 각각 11, 7이라고 가정하면 5등에 당첨될 수 있습니다.
 * 5등을 만드는 다른 방법들도 존재합니다. 하지만, 6등(낙첨)으로 만드는 것은 불가능합니다.
 * 민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다
 * . 이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
 * <p>
 * <p>
 * <p>
*/