package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        solve(new ArrayList<>(List.of(3, 10, 2, 9)), 1, 12);
    }

    static void solve(List<Integer> bill, int k, int b) {
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i == k)
                continue;
            sum += bill.get(i);
        }

        sum /= 2;
        ans = b - sum;

        if (sum >= b) {
            System.out.println("Bon Appetit");
        } else {

            System.out.println(ans);
        }

    }
}
