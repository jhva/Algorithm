package org.example.programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class level2주차요금계산 {

    public static void main(String[] args) {
        solve(new int[] {1, 461, 1, 10}, new String[] {
            "00:00 1234 IN"});
    }

    static void solve(int[] fees, String[] records) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> result = new HashMap<>();

        for (String re : records) {
            String[] record = re.split(" "); // 띄어쓰기 기준으로 항목별로 배열에 넣음
            int t = getMin(record[0]); // 시간
            String carNum = record[1]; // 차량번호
            String inOut = record[2]; //출입

            if (inOut.equals("IN")) {
                hashMap.put(carNum, t);

                // result.put(carNum, (hour * 60 + minute) - hashMap.get(carNum));
            } else {
                if (!result.containsKey(carNum)) {
                    result.put(carNum, t - hashMap.get(carNum));

                } else {
                    result.put(carNum, result.get(carNum) +t- hashMap.get(carNum));
                }
                hashMap.remove(carNum);
            }
        }

        for (String key : hashMap.keySet()) {
            if (!result.containsKey(key)) {
                result.put(key, (23 * 60 + 59) - hashMap.get(key));
            } else {
                result.put(key, (23 * 60 + 59) - hashMap.get(key) + result.get(key));
            }

        }

        Map<String, Integer> sort = new TreeMap<>(result);

        int[] answer = new int[result.size()];
        int index = 0;
        for (String key : sort.keySet()) {
            int min = sort.get(key);
            if (min <= fees[0]) {
                answer[index++] = fees[1];
            } else {
                answer[index++] = (int)(fees[1] + Math.ceil((double)(min - fees[0]) / fees[2]) * fees[3]);
            }

        }

        System.out.println(Arrays.toString(answer));

    }

    public static int getMin(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);

    }
}
