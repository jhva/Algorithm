package org.example.hacker.medium;

import java.util.*;

public class ClimbingtheLeaderBoard {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 100, 50, 40, 40, 20, 10);
        List<Integer> list2 = Arrays.asList(5, 25, 50, 120);
        solve(list, list2);
    }

    static void solve(List<Integer> ranked, List<Integer> player) {
        HashSet<Integer> set = new HashSet<>(ranked);
        ranked = new ArrayList<>(set);
        Collections.sort(ranked, Collections.reverseOrder());
        System.out.println(ranked);
        List<Integer> answer = new ArrayList<>();

        for (int s : ranked) {
            System.out.println(s);
        }

        for (int p : player) {

            int left = 0; //1
            int right = ranked.size() - 1; //last
            int mid = 0;

            int rank = 0;
            while (left <= right) {
                mid = (left + right) / 2;
                if (p > ranked.get(mid)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

                if (p == ranked.get(mid)) break;
            }

            if (p < ranked.get(mid)) {
                rank = mid + 1;
            } else {
                rank = mid;
            }
            System.out.println(answer);
            answer.add(rank + 1);


        }
        System.out.println(answer);

    }
}
