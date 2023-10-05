package org.example.programmers.level1;

import java.util.Arrays;

/*
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.

예를 들어 "AB"는 1만큼 밀면 "BC"가 되고,
3만큼 밀면 "DE"가 됩니다.
"z"는 1만큼 밀면 "a"가 됩니다.
 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수,
  solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자,
공백으로만 이루어져 있습니다.

s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
입출력 예
s	n	result
"AB"	1	"BC"
"z"	1	"a"
"a B z"	4	"e F d "
 */
public class level1시저암호 {
    public static void main(String[] args) {
        solve("AB", 1);
    }

    static String solve(String s, int n) {

        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // A, B

            if (Character.isUpperCase(ch)) {
                //대문자
//                System.out.println((ch - 'A' + n) % 26 + 'A');

                // ch -'A' 대문자(A)일때 0 그리고  문제는 n만큼 밀린다했으니까 +n 을해준다 ch - 'A' 는 0 (0은 charAt에서 나온 값)-65 랑똑같다  0,
                // (ch- 'A'+n) 을 하게되면 1, 2 가되고
                // (1)%26+'A' (+'A' 를 하게되면  아스키코드상 65 를더하는거랑같다)
                // 26 을하는이유는 a~z 에서 해야하는데 26을넘어가면안되서  z = 123 에서 - 'a' 하면
                //123 - 97 ('a'= 97)  = 26  26%26 =0 그 후 + 'a' 를 하면 97
                // char 형 변환하면  'a'
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            } else if (Character.isLowerCase(ch)) {
                //소문자
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }
            answer += ch;
            System.out.println(answer);

        }

        return answer;
    }

}

