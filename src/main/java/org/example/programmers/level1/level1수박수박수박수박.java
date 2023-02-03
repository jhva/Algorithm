package org.example.programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요
. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	"수박수"
4	"수박수박"
 */
public class level1수박수박수박수박 {
    public static void main(String[] args) {
        solve(4);
    }

    static void solve(int num) {
        String answer = "";
        String strValue[] = new String[num];
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                strValue[i] = "수";
            } else {
                strValue[i] = "박";
            }
        }
        answer = Arrays
                .stream(strValue) // 문자열 배열 전달
                .collect(Collectors.joining()); // 문자열 배열을 Join
        System.out.println(answer);
//
//        for (int i = 0; i < num; i++) {
//            if (num % 2 == 0) {
//                answer += "수";
//            } else {
//                answer = "박";
//            }
//        }
//        System.out.println(answer);
//        int index = 0;
//
//        if (num % 2 == 0) {
//            answer = "수";
//        }else{
//            answer="박수";
//        }
//        System.out.println(answer);
    }
}
