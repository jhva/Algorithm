package main.java.org.example.브루트포스;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.
 * <p>
 * 한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
 * <p>
 * 김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
 * <p>
 * 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
 * <p>
 * N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오\
 * <p>
 * <p>
 * <p>
 * 출력 : 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
 * 5 21
 * 5 6 7 8 9 예제출력 21
 */
public class 블랙잭 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //N의 값

        int M = sc.nextInt(); // 최종값

        int[] resultList = new int[N];
        for (int i = 0; i < N; i++) {
            resultList[i] = sc.nextInt();
            //각값 받기
        }
        System.out.println(Arrays.toString(resultList));
        int result = brouteSearch(resultList, N, M);


        System.out.println(result);
    }

    public static int brouteSearch(int[] RESULTLIST, int N, int M) {
        int sum = 0;

        //맨첫번째 카드  ex) 4
        for (int i = 0; i < N - 2; i++) {
            //두번째카드
            for (int j = i + 1; j < N - 1; j++) {
                //세번째카드
                for (int k = j + 1; k < N; k++) {
                    int initSUM = RESULTLIST[i] + RESULTLIST[j] + RESULTLIST[k];

                    if (M == initSUM) {
                        return initSUM;
                    }

                    //그렇지 않다면 최대한 근접하게 result 값에 넣어준다.
                    if ((sum < initSUM) && (initSUM < M)) {
                        sum = initSUM;
                    }
                }
            }

        }

        return sum;
    }

}
