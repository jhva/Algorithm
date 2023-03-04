package org.example.programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class level1카드뭉치 {

    public static void main(String[] args) {

        solve(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        //result YES
    }

    static void solve(String[] cards1, String[] cards2, String[] goal) {
        String answer = "YES";

        int card1Index = 0, card2Index = 0;
        for (int i = 0; i < goal.length; i++) {
            if (card1Index < cards1.length && goal[i].equals(cards1[card1Index])) {
                card1Index++;
            } else if (card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {
                card2Index++;
            } else {
                answer="NO";
                break;
            }
        }
        System.out.println(answer);

    }
}
