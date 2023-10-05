package org.example.programmers.level1;

import java.util.Arrays;

/*


문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
입출력 예
s	return
"a234"	false
"1234"	true
문제가 잘 안풀린다면😢
힌트가 필요한가요? [코딩테스트 연습 힌트 모음집]으로 오세요! → 클릭
 */
public class level1문자열다루기기본 {

    public static void main(String[] args) {
        solution("a1234");
    }

    static void solution(String s) {
        boolean answer = true;
//        char[] arr = s.toCharArray();
//        if(s.length() != 4 && s.length() != 6) return false;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(s.charAt(i) - 48);
//            if (s.charAt(i) - 48 > 57) {
//                answer = false;
//            }
//
//        }
//        return answer;
        // 96.7% 시발
        try {
            int value = Integer.parseInt(s);

        }catch(NumberFormatException e){
            answer=false;
        }
        System.out.println(answer);
    }
}
