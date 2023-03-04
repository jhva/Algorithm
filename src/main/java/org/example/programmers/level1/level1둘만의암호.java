package org.example.programmers.level1;

import java.util.*;

public class level1둘만의암호 {
    public static void main(String[] args) {

        solve("aukks", "wbqd", 5); //happy
    }

    static void solve(String s, String skip, int index) {
        char[] str = s.toCharArray();

        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c += 1;
                System.out.println(c);
                if (c > 122) c -= 26;
                if (skip.contains(String.valueOf(c))){
                    j--;
                } // 왜 이렇게 생각을 못했을까
                //
            }
            answer += c;
        }

        System.out.println(answer);


    }
}


/**
 * 두 문자열 s와 skip, 그리고 자연수 index가 주어질 때, 다음 규칙에 따라 문자열을 만들려 합니다. 암호의 규칙은 다음과 같습니다.
 * <p>
 * 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
 * index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
 * skip에 있는 알파벳은 제외하고 건너뜁니다.
 * <p>
 * <p>
 * 예를 들어 s = "aukks", skip = "wbqd", index = 5일 때, a에서 5만큼 뒤에 있는 알파벳은 f지만
 * [b, c, d, e, f]에서 'b'와 'd'는 skip에 포함되므로 세지 않습니다.
 * <p>
 * 따라서 'b', 'd'를 제외하고 'a'에서 5만큼 뒤에 있는 알파벳은 [c, e, f, g, h] 순서에 의해 'h'가 됩니다.
 * vwxyz
 * 나머지 "ukks" 또한 위 규칙대로 바꾸면 "appy"가 되며 결과는 "happy"가 됩니다.
 * <p>
 * <p>
 * 두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과를 return하도록 solution 함수를 완성해주세요.
 */