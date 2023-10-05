package org.example.정렬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class 좌표압축_18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 몇개받고

        int[] arr = new int[N]; //원본배열에저장
        int[] changeArr = new int[N]; // 정렬할배열에 저장
        HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
        //key value 형태 Map을 통한 ranking
        for (int i = 0; i < N; i++) {
            arr[i] = changeArr[i] = sc.nextInt();
            //각 원본배열과 정렬할배열을 다 입력받고
        }
        //일단 정렬할배열 chageArr 를 정렬한다
        Arrays.sort(changeArr);

        int ranking = 0;
        for (int r : changeArr) {
            //changeArr를돌면서 중복키제거 하고 넣어준 후
            // ranking++;
            if (!rank.containsKey(r)) {
                rank.put(r, ranking);
                ranking++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            int rannkings = rank.get(key);
            sb.append(rannkings).append(' ');
        }
        System.out.println(sb);
    }
}
