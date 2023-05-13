package org.example.programmers.level2;

public class level2단속카메라 {
    public static void main(String[] args) {

        solve(new int[][] {{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}});
    }

    static void solve(int[][] routes) {
        int answer = 0;
        int[] array = new int[routes.length];
        System.out.println(Integer.MIN_VALUE);
        for (int i = 0; i < routes.length; i++) {
            array[i] = routes[i][1];

            for (int j = i + 1; j < routes.length; j++) {
                int out = routes[j][0];
                if (array[i] < out || array[i]==out) {
                    answer++;
                }
            }
        }


        System.out.println(answer-2);

    }
}
