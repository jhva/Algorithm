package org.example.programmers.level2;

public class level2타겟넘버 {
    static int answer = 0;

    public static void main(String[] args) {
        solve(new int[] {1, 1, 1, 1, 1}, 3);
    }

    static void solve(int[] numbers, int target) {

        // 2. dfs 함수 실행.
        dfs(numbers, target, 0, 0);
        System.out.println(answer);

    }

    static void dfs(int[] numbers, int target, int idx, int sum) {
        // 3. 배열 마지막 노드까지 탐색이 끝났는지 체크
        if (idx == numbers.length) {
            // 4. 합계와 타겟 값이 같으면 answer을 1 증가 시킴.
            if (sum == target)
                answer++;
        } else {
            dfs(numbers, target, idx + 1, sum + numbers[idx]);
            dfs(numbers, target, idx + 1, sum - numbers[idx]);
        }
    }
}