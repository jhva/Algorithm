package org.example.programmers.level2;

public class level2모음사전 {
    static int answer = 0;

    public static void main(String[] args) {
        solve("AAAAE");
    }

    static void solve(String word) {
        //5*1+1 = 6
        // 6*5+1 = 31
        String aeiou = "AEIOU";
        int[] hard = {781, 156, 31, 6, 1};

        int index, result = word.length();

        for (int i = 0; i < word.length(); i++) {
            index = aeiou.indexOf(word.charAt(i));
            System.out.println(index);
            result += hard[i] * index;
        }
        System.out.println(result);

    }

}
