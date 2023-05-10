package org.example.programmers.level3;

import java.util.HashSet;

// public class level3불량사용자 {
//
//     static int answer = 0;
//     private HashSet<HashSet<String>> result = new HashSet<>();
//
//     public static void main(String[] args) {
//         solve(new String[] {"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[] {"*rodo", "*rodo", "******"});
//     }
//
//     static void solve(String[] user_id, String[] banned_id) {
//
//
//         // for (int i = 0; i < user_id.length; i++) {
//         //     if (i >= banned_id.length) {
//         //         break;
//         //     }
//         //     // check(banned_id[i], user_id[i]);
//         // }
//         //
//         // if(user_id.length-1 == banned_id.length){
//         //     answer++;
//         // }
//         // System.out.println(answer);
//     }
//
//     // static void check(String banned, String userId) {
//     //     int matchCount = (int)Math.round((double)banned.length() / 2);
//     //     int count = 0;
//     //     int star = 0;
//     //     for (int i = 0; i < banned.length(); i++) {
//     //         String s = String.valueOf(banned.charAt(i));
//     //         if (s.equals("*")) {
//     //             star++;
//     //         }
//     //         count++;
//     //     }
//     //
//     //     if (star == banned.length()) {
//     //         answer -= 1;
//     //     }
//     //     if (count >= matchCount) {
//     //         answer++;
//     //     }
//     //
//     // }
// }


public class level3불량사용자 {
    private static HashSet<String> ban_user_idx;
    public int solution(String[] user_id, String[] banned_id) {
        boolean visited[] = new boolean[user_id.length]; // 방문체크
        ban_user_idx = new HashSet<String>(); // 중복제거
        dfs(user_id, banned_id, 0, visited); // 경우의 수 찾기
        int answer = ban_user_idx.size();
        return answer;
    }

    private void dfs(String[] user_id, String[] banned_id, int ban_idx, boolean[] visited) {
        if(ban_idx == banned_id.length) { // ban된 id 모두 선택
            StringBuilder user_idxs = new StringBuilder();
            for(int i = 0; i < user_id.length; i++) {
                if(visited[i]) {
                    user_idxs.append(i); // 모든 인덱스를 이어붙이자
                }
            }
            ban_user_idx.add(user_idxs.toString()); // 중복된 값 없는 모든 인덱스
            return ;
        }
        for(int i = 0; i < user_id.length; i++) {
            if(visited[i]) continue;
            boolean flag = false;
            // 유저와 밴 된 유저의 길이가 같은 경우만 체크
            if(user_id[i].length() == banned_id[ban_idx].length()) {
                for(int s = 0; s < user_id[i].length(); s++) {
                    if(banned_id[ban_idx].charAt(s) == '*') continue;
                    // 하나라도 다른 글자가 포함되어 있다면 멈추고 다음 유저로
                    if(user_id[i].charAt(s) != banned_id[ban_idx].charAt(s)) {
                        flag = true;
                        break;
                    }
                }
                if(!flag) { // 모든 글자가 맞았다
                    visited[i] = true;
                    dfs(user_id, banned_id, ban_idx+1, visited); // 다음 탐색
                    visited[i] = false;
                }
            }
        }
    }
}