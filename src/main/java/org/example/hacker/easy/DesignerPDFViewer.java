package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        solve(new ArrayList<>(List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
        )), "abc");
    }

    static void solve(List<Integer> h, String word) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int s = word.charAt(i) - 'a';
            int wordH = h.get(s);
            max = Math.max(max, wordH);
        }
        ans = max * word.length();
        System.out.println(ans);
    }
}
