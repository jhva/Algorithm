package org.example.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

public class level1가장가까운같은글자 {

    public static void main(String[] args) {
        solve("banana");
    }

    static void solve(String s) {
        String[] str = s.split("");
        int index = -1;
        int[] arr = new int[str.length];
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            System.out.println(word);
//글자 가져오기(1)

            if (!hashMap.containsKey(word)) { // 포함되어있는지보기 없으면 -1
                arr[i] = -1;
            } else {
                int value = hashMap.get(word); // 포함되어있단얘기니까 그 단어 index 가져오기
                arr[i] = i - value; // 현재 돌고있는 index 와 위에서 구한 value 빼주고 넣어주기
            }
            hashMap.put(word, i); //
            //해당 글자와 index 집어넣기 (2)

        }
        System.out.println(Arrays.toString(arr));

    }
}
/**
 * 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서
 * * , 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
 * * 예를 들어, s="banana"라고 할 때,
 * * 각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
 * * <p>
 * * b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
 * a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
 * n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
 * a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.
 * n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.
 * a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.
 * 따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.
 */