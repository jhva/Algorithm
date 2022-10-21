package main.java.org.example.정렬;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 소트인사이드_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        Integer[] arr = new Integer[n];  //내림차순으로 정렬할 배열. int형이 아닌 Integer형으로 선언

        for (int i = 0; i < n; i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }


        Arrays.sort(arr, Collections.reverseOrder());  //내림차순으로 정렬
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
