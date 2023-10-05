package org.example.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class beakjoon_1152 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] StringInput = sc.nextLine().trim().split(" ");
//        int cnt = StringInput.length;
//        if (cnt == 1000000) {
//            return;
//        }
//        System.out.println(Arrays.stream(StringInput).count());

        //원래 푼코드 ..................

        ///나랑 비슷한 생각을 가진사람은

        /// String s = sc.nextLine().trim(); 공백제거 후
        // System.out.println(S.split(" ").length(); 만하면되는문제였다 ....
        /// ㅅㅂ....................
        //생각이너무많다


        //이어서 다른문제푼사람들 에 대한 답지
        //StringTokenizer 에대해서 알아놓자.....
        // StringTokenizer는 띄어쓰기를 기준으로 단어를 분류할수있다.................

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//입력을받고
        StringTokenizer st = new StringTokenizer(s," "); // 첫번재인자에 문자열 집어넣고 두번째에 띄어쓰기를 포함할지안할지 정하는인자라고한다.
        //공백을 기준으로 토큰을 만들지만 공백은 토큰을 만들지 않는다고 함 .
        int cnt = st.countTokens();
        System.out.println(cnt);
    }
}
