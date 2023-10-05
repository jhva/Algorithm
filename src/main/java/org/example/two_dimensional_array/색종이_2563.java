package org.example.two_dimensional_array;

import java.util.Scanner;

public class 색종이_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] crPaper = new int[100][100];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            for (int x = X; x < X + 10; x++) {
                for (int y = Y; y < Y + 10; y++) {
                    if (crPaper[x][y] == 1) continue;
                    crPaper[x][y] = 1;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}


/**
 * 가로 세로 각각 10인 정사각형 모양
 * <p>
 * <p>100 100
 * <p>
 * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
 * 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
 * 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오
 *
 *
 * 하나의 넓이르 1로 생각하고
 * 100 100 으로 잡아준후
 * 1이아닌거는 건너뛰고 1인건 다 count를 세준다
 */