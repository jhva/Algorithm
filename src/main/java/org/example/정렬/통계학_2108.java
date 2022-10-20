package main.java.org.example.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 통계학_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        int average = 0;
        int mid = 0;
        int often = 0;
        int range = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine()); //숫자 입력받기
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        average = (int) Math.round(((double) sum / N)); //산술 평균

        Arrays.sort(arr);
        mid = arr[N / 2];

        int[] plus = new int[4002];
        int[] minus = new int[4001];

        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                minus[Math.abs(arr[i])]++;
            } else {
                plus[arr[i]]++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        //빈도수높은

        int max = 0;
        for (int i = 0; i < plus.length; i++) {
            max = Math.max(max, plus[i]);
        }

        for (int i = 0; i < minus.length; i++) {
            max = Math.max(max, minus[i]);
        }

        //따른 array 담기
        //아이템 갯수 만큼 루프도는 for문

        for (int item : arr) {
            if (item < 0) {
                if (minus[Math.abs(item)] == max && !(list.contains(item))) {
                    list.add(item);
                }
            } else {
                if (plus[item] == max && !(list.contains(item))) {
                    list.add(item);
                }
            }

        }

        //list안에 두개이상이면 작은 것 출력

        if (list.size() >= 2) {
            often = list.get(1);
        } else {
            often = list.get(0);
        }

        //범위

        range = arr[N - 1] - arr[0];

        System.out.println(average);
        System.out.println(mid);
        System.out.println(often);
        System.out.println(range);

    }
}
