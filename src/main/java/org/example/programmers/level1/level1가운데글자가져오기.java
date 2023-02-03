package org.example.programmers.level1;


/*
단어 s의 가운데 글자를 반환하는 함수,
 solution을 만들어 보세요.
  단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"
 */
public class level1가운데글자가져오기 {
    public static void main(String[] args) {
        solve("qwer");
    }

    static void solve(String str) {
        String answer = "";
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length; i++) {
            int index = strArr.length / 2;

            if (strArr.length % 2 == 0) {
                answer = strArr[index - 1] + strArr[index];
            } else {
                answer = strArr[index];
            }
        }
        System.out.println(answer);
    }
}
