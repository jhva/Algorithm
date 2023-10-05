package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        solve(3, new ArrayList<>(List.of(-1, -3, 4, 2)));
    }

    static void solve(int k, List<Integer> a) {
        int count = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= 0) {
                count++;
            }
        }

        if (count >= k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
