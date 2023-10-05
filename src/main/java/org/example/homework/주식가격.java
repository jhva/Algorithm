package org.example.homework;


import java.util.Arrays;

public class 주식가격 {
    public static void main(String[] args) {
        solve(new int[]{1, 2, 3, 2, 3});
    }

    static void solve(int[] prices) {
        int[] answer = new int[prices.length];
        //1초시점에서 1은 끝까지 가격이떨어지지않는다. => 리턴값이 4 4라는건 index 기준
        //3초시점의 3은 1초뒤에 가격이떨어진다 초는 무조건 ms ++ 가되기때문에 1초방어를해주는거를 알수있고
        // 기준점이 j보다 클경우엔 break;

        for (int i = 0; i < prices.length; i++) {
            int ms = 0;
            for (int j = i + 1; j < prices.length; j++) { // i =0 이여서 i+1을해줬다 비교해줄필요가없음. 같은값이기때문에
                ms++; // 시간 초 (가격이 떨어지지 않을 초 )

                if (prices[i] > prices[j]) {//기준점이 더 클경우 break;
                    break;
                }
            }
            /**
             *  5초는 j<prices.length 범위를 넘었기때문에 0
             */
            answer[i] = ms;
        }

    }
}


