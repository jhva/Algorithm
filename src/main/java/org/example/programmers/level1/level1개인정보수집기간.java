package org.example.programmers.level1;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class level1개인정보수집기간 {

    public static void main(String[] args) {
        solve("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A",
                "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }

    static void solve(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int[] answer = {};

        for (String term : terms) {
            map.put(term.split(" ")[0], Integer.valueOf(term.split(" ")[1]));
        }
        int todayNumber = (Integer.parseInt(
                today.split("\\.")[0]) * 12 * 28) +
                (Integer.parseInt(today.split("\\.")[1]) * 28) +
                Integer.parseInt(today.split("\\.")[2]);


        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String[] privacyDate = privacy[0].split("\\.");
            int privacySum = (Integer.parseInt(privacyDate[0]) * 12 * 28)
                    + (Integer.parseInt(privacyDate[1]) * 28) +
                    Integer.parseInt(privacyDate[2]);
            int matchTerms = map.get(privacies[i].split(" ")[1]) * 28;
            int sum = privacySum + matchTerms;

            if (todayNumber >= sum) {
                arr.add(i + 1);
                //i+1을 한이유는 privacies[i]는 i+1번 개인정보의 수집 일자와 약관 종류를 나타냅니다. 이 구문이 있었기때문에
            }

        }

        answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {

            answer[i] = arr.get(i);

        }

        //각 년도월일을 일수로 계산해서 값을 넣어준후 . => privacies랑 해당 년월일을 일수로변경하고 비교하여 작은것들을 arr에 넣어주고
        // arr에 담은 값들을 배열로 다시 넣은후 반환
        System.out.println(Arrays.toString(answer));
    }
}


/**
 * 고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있습니다.
 * 약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있습니다.
 * 당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다. 수집된 개인정보는 유효기간 전까지만 보관 가능하며,
 * <p>
 * 유효기간이 지났다면 반드시 파기해야 합니다.
 * <p>
 * 예를 들어, A라는 약관의 유효기간이 12 달이고,
 * 2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었다면 해당 개인정보는 2022년 1월 4일까지 보관 가능하며 2022년 1월 5일부터 파기해야 할 개인정보입니다.
 * 당신은 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 합니다.
 * <p>
 * 모든 달은 28일까지 있다고 가정합니다.
 * <p>
 * 다음은 오늘 날짜가 2022.05.19일 때의 예시입니다.
 */