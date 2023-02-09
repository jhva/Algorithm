package org.example.programmers.level1;

public class level1콜라문제 {
    public static void main(String[] args) {

        solve(3, 1, 20);
    }

    static void solve(int a, int b, int n) {

        int cnt = 0;
        while (n>=a) {
            n = n - a + b;//그냥 단순히 20-3 17+b 18 똑같다  돌때마다 cnt ++ 답 이나옴
            cnt+=b;

        }
        System.out.println(cnt);
    }
}
/**
 * 콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트가 있다. 빈 병 20개를 가져다주면 몇 병을 받을 수 있는가?
 * <p>
 * 단, 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.
 * <p>
 * 2 , 1 ,20
 * <p>
 * <p>
 * <p>
 * <p>
 * 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제입니다.
 * 기존 콜라 문제와 마찬가지로, 보유 중인 빈 병이 a개 미만이면,
 * 추가적으로 빈 병을 받을 순 없습니다. 상빈이는 열심히 고심했지만,
 * 일반화된 콜라 문제의 답을 찾을 수 없었습니
 */