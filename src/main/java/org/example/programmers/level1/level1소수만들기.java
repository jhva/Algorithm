package org.example.programmers.level1;

public class level1소수만들기 {

    public static void main(String[] args) {
        solve(new int[]{1, 2, 3, 4});
    }

    static void solve(int[] nums) {
        int cnt = 0;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            //1
            for (int j = i + 1; j < nums.length; j++) {
                //2
                for (int k = j + 1; k < nums.length; k++) {
                    //3

                    cnt = nums[i] + nums[j] + nums[k];
                    System.out.println(cnt);

                    if (check(cnt)) {
                        answer++;
                    }
                }
            }
        }

//        System.out.println(cnt);
    }

    static boolean check(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
                //소수가아님
            }
        }
        return true;
    }
}

