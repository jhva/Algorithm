package org.example.homework;


import java.util.*;

public class 리트코드펠린드롬페어 {

    static TrieNode root = new TrieNode();
    static int N;
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        solve(new String[]{"bat", "tab", "cat"});
    }

    static void solve(String[] words) {
        List<List<Integer>> answer = new ArrayList<>();
        N = words.length;

        for (int i = 0; i < N; i++) {
            add(words[i], i);
        }

        for (int i = 0; i < N; i++) {
            search(words[i], i);
        }
        System.out.println(res);
    }

    private static void search(String word, int wIdx) {
        TrieNode cur = root;
        char[] chs = word.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            int j = chs[i] - 'a';
            if (cur.wordIdx != -1 && isPalindrome(chs, i, chs.length - 1)) res.add(Arrays.asList(wIdx, cur.wordIdx));

            if (cur.children[j] == null) return;

            cur = cur.children[j];
        }

        if (cur.wordIdx != -1 && cur.wordIdx != wIdx) res.add(Arrays.asList(wIdx, cur.wordIdx));

        for (int j : cur.palindromeList) {
            res.add(Arrays.asList(wIdx, j));
        }
    }

    private static void add(String w, int wIdx) {
        TrieNode cur = root;
        char[] chs = w.toCharArray();

        for (int i = chs.length - 1; i >= 0; i--) {
            int j = chs[i] - 'a';
            if (isPalindrome(chs, 0, i)) cur.palindromeList.add(wIdx);
            if (cur.children[j] == null) cur.children[j] = new TrieNode();

            cur = cur.children[j];
        }
        cur.wordIdx = wIdx;
    }

    private static boolean isPalindrome(char[] chs, int i, int j) {
        while (i < j) if (chs[i++] != chs[j--]) return false;
        return true;
    }
}


class TrieNode {
    TrieNode[] children = new TrieNode[26];
    int wordIdx = -1;
    List<Integer> palindromeList;

    TrieNode() {
        palindromeList = new ArrayList<>();
    }
}
