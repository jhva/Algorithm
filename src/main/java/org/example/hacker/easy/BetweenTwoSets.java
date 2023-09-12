package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        solve(new ArrayList<>(List.of(1)), new ArrayList<>(List.of(100)));
    }

    static void solve(List<Integer> a, List<Integer> b) {
        int ans = 0;

        int lcmValue = calculateLCM(a);
        ArrayList<Integer> list = new ArrayList<>();
        int gcdValue = calculateGCD(b);
        System.out.println(lcmValue);

        for (int i = lcmValue, j = 2; i <= gcdValue; i = lcmValue * j, j++) { //배수를 확인하기위해서 최대공약수
            if (gcdValue % i == 0) {
                ans++;
            }

        }

        System.out.println(ans);
    }

    static int calculateGCD(List<Integer> numbers) {
        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = gcd(result, numbers.get(i));
        }
        return result;
    }

    static int calculateLCM(List<Integer> numbers) {
        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = lcm(result, numbers.get(i));
        }
        return result;
    }

    static int gcd(int a, int b) { // 최대공약수
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) { //최소공배수
        return a * b / gcd(a, b);
    }

}
