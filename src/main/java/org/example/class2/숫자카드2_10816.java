package org.example.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 숫자카드2_10816 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        int[] arr = new int[N];
//        int[] Marr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int M = sc.nextInt();
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//        for (int i = 0; i < M; i++) {
//            Marr[i] = sc.nextInt();
////            hashMap.put(i, arr[i]);
//
//        }
//
//        int ranking = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < M; j++) {
//                if (arr[i] == Marr[j]) {
//                    hashMap.put(i, ranking);
//                    ranking++;
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int key : arr) {
//            int rannkings = hashMap.get(key);
//            sb.append(rannkings).append(' ');
//        }
//        System.out.println(sb);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();


        int N = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());

            /*
             * getOrDefault(key, defaultValue)
             * key에 대해 map에 저장 된 value를 반환한다.
             * 만약 value가 없을 경우 defaultValue값을 반환한다.
             */

            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(hashMap.getOrDefault(key, 0)).append(' ');
        }
        System.out.println(sb);
    }
}
