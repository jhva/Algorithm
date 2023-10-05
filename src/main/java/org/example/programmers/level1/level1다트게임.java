package org.example.programmers.level1;

import java.util.Arrays;

public class level1다트게임 {
    public static void main(String[] args) {
        solve("1S2D*3T");
    }

    static void solve(String dartResult) {
        int answer = 0;
        int[] scoreboard = new int[3];
        String num = "";
        int cnt = 0;
        int index = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            // 숫자부터 검색해보자
            if (ch >= '0' && ch <= '9') {
                //0점부터 ~ 10점까지
                num += String.valueOf(ch); //숫자
            } else if (ch == 'S' || ch == 'D' || ch == 'T') {
                cnt = Integer.parseInt(num); //제곱해줄려고
                if (ch == 'S') {
                    cnt = (int) Math.pow(cnt, 1);
                } else if (ch == 'D') {
                    cnt = (int) Math.pow(cnt, 2);
                } else {// T일때 세제곱
                    cnt = (int) Math.pow(cnt, 3);
                }
                scoreboard[index++] = cnt; // 각 제곱만 넣어주기
                num = "";// 여기까지오면 다음부분을위해 다시 초기화
            } else {
                if (ch == '#') { // # 일때
                    scoreboard[index - 1] *= -1;
                }else{
                    // * 일때
                    scoreboard[index - 1] *= 2;
                    if(index-2>=0){
                        scoreboard[index-2] *= 2;
                    }
                }
            }
        }
        for(int i=0; i<scoreboard.length; i++){
            answer+=scoreboard[i];
        }
        System.out.println(answer);
    }
}

/**
 * 다트 게임은 총 3번의 기회로 구성된다.
 * 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
 * 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서
 * 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
 * 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시
 * 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다.
 * 아차상(#) 당첨 시 해당 점수는 마이너스된다.
 * <p>
 * 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
 * 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
 * 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
 * Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
 * 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
 * 0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라
 * <p>
 * <p>
 * 1	1S2D*3T 	37	1 1 * 2 + 22 * 2 + 33
 * 2	1D2S#10S	9	1 2 + 21 * (-1) + 101
 * 3	1D2S0T	    3	1 2 + 21 + 03
 * 4	1S*2T*3S	23	1 1 * 2 * 2 + 23 * 2 + 31
 * 5	1D#2S*3S	5	1 2 * (-1) * 2 + 21 * 2 + 31
 * 6	1T2D3D#	    -4	1 3 + 22 + 32 * (-1)
 * 7	1D2S3T*	    59	1 2 + 21 * 2 + 33 * 2
 * .
 */