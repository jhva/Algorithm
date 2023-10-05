package org.example.programmers.level1;

import java.util.*;

public class level1명예의전당 {
    public static void main(String[] args) {
        solve(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }

    static void solve(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> arList = new ArrayList<>(); //원래 스택을 생각했찌만 ? 모르겠따 구현을


        for (int i = 0; i < score.length; i++) {
//
            if (arList.size() < k) {
                arList.add(score[i]); //넣어줘야함 k개까지
                Collections.sort(arList); //정렬하게되면 제일작은수 앞에
                answer[i] = arList.get(0); // 그수 답에 넣어줌
                continue; // 3이되기전까지는 아래구문무시 다시 수행
            }

            if (arList.size() == k) {
                //이제 k개랑 사이즈랑 같으면 비교해줘야함
                int min = arList.get(0);

                if (min < score[i]) {
                    arList.remove(0); //
                    arList.add(score[i]); //더큰수를 넣어준다
                    Collections.sort(arList);//여기서 sort를계속해주기때문에 무조건 작은수는 0번재다 0번째넣어주고
                }
                answer[i]=arList.get(0);
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}


/**
 * "명예의 전당"이라는 TV 프로그램에서는 매일 1명의 가수가 노래를 부르고,
 * 시청자들의 문자 투표수로 가수에게 점수를 부여합니다.
 * 매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 해당
 * 가수의 점수를 명예의 전당이라는 목록에 올려 기념합니다. 즉
 * 프로그램 시작 이후 초기에 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오르게 됩니다
 * . k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번째 순위의 가수 점수보다 더 높으면,
 * 출연 가수의 점수가 명예의 전당에 오르게 되고 기존의 k번째 순위의 점수는 명예의 전당에서 내려오게 됩니다.
 * <p>
 * 이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다. 예를 들어, k = 3이고,
 * 7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200]이라면,
 * 명예의 전당에서 발표된 점수는 아래의 그림과 같이 [10, 10, 10, 20, 20, 100, 100]입니다.
 * 명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.
 */