package main.java.org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 0.15 초 (추가 시간 없음) (하단 참고)	128 MB	178548	50683	42851	29.392%
 * 문제
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 * <p>
 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
 * <p>
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 */
public class 달팽이는올라가고싶다_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int day = (C - B) / (A - B);//나누어떨어진경우 나머지가 남는경우

        if ((C - B) % (A - B) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
