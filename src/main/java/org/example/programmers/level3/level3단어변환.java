package org.example.programmers.level3;

public class level3단어변환 {
    static boolean[] visit;
    static int answer = 0;

    public static void main(String[] args) {
        int ans = solve("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"});
    }

    static int solve(String begin, String target, String[] words) {

        visit = new boolean[words.length];
        recursive(begin, target, 0, words);

        return answer;
    }

    static void recursive(String begin, String target, int start, String[] words) {
        if (begin.equals(target)) {
            answer = start;
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (visit[i])
                continue;
            int idx = 0;

            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    idx++;
                }
            }
            if (idx == begin.length() - 1) {
                visit[i] = true;
                recursive(words[i], target, start + 1, words);
                visit[i] = false;
            }
        }
    }
}
