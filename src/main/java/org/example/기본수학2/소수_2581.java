package main.java.org.example.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 * <p>
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
 * <p>
 * 입력
 * 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
 * <p>
 * M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
 * <p>
 * 출력
 * M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
 * <p>
 * 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 */


public class 소수_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine()); //60
        int N = Integer.parseInt(br.readLine()); //100

        int min = N; //100
        int sum = 0;

        for (int i = M; i <= N; i++) {
            boolean check = true;
            if (i == 1) check = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }


            if (check) {
                //true면 100 >2 100 = i;
                if (min > i) min = i;
                System.out.println(min);
                System.out.println(i);
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }


    }

}
