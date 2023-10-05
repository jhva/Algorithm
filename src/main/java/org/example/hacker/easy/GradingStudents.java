package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {

        solve(new ArrayList<>(List.of(73, 67, 38, 33)));
    }

    static void solve(List<Integer> grades) {
        int endnum = grades.size();
        int searchnum;
        int restnum;

        List newgrades = new ArrayList<>();

        for (int i = 0; i < endnum; i++) {

            searchnum = grades.get(i);
            restnum = searchnum % 5;
            //System.out.println(restnum);

            if (searchnum == 100 || searchnum < 38) { //100
                newgrades.add(searchnum);

            } else {
                if (restnum >= 3) {
                    newgrades.add(searchnum + (5 - restnum));
                } else {
                    newgrades.add(searchnum);
                }
            }

        }
        System.out.println(newgrades);

    }
}
