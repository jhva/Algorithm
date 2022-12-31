package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int[] arr = new int[26]; //알바펫 26개

        String str = br.readLine().toUpperCase();//대문자로 모두 다 치환

        for (char chr : str.toCharArray()) {
            arr[chr - 'A']++;
            //A를 빼주면 해당 인덱스 를 구할수있음
        }
        int max = 0;
        char answer = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer = (char) (i + 'A');// 알파벳으로 치환
            }
            else if (arr[i] == max) answer = '?';
        }
        System.out.println(answer);
    }
}

/**
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 * <p>
 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * <p>
 * 출력
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * <p>
 * 예제 입력 1
 * Mississipi
 * 예제 출력 1
 * ?
 * 예제 입력 2
 * zZa
 * 예제 출력 2
 * Z
 * 예제 입력 3
 * z
 * 예제 출력 3
 * Z
 * 예제 입력 4
 * baaa
 * 예제 출력 4
 * A
 */