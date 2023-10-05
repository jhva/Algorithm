package org.example.programmers.level1;

import java.util.Arrays;

public class level1바탕화면정리 {
    public static void main(String[] args) {
        solve(new String[]{".#...", "..#..", "...#."});
    }

    static void solve(String[] wallpaper) {
        int xMax = 0, yMax = 0;
        int xMin = 51, yMIn = 51;
        int[] answer = {};
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (i < xMin) xMin = i;
                    if (i > xMax) {
                        xMax = i;
                    }
                    if (j < yMIn) {
                        yMIn = j;
                    }
                    if (j > yMax) {
                        yMax = j;
                    }
                }
            }
        }
        answer = new int[]{xMin, yMIn, xMax + 1, yMax + 1};
        System.out.println(Arrays.toString(answer));
    }
}
