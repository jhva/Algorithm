package org.example.programmers.level0;


public class level0369게임 {
    public static void main(String[] args) {
        solve(3);
    }

    static int solve(int order) {
        int answer = 0;
        String str = "" + order;

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == '3' || temp == '6' || temp == '9') {
                answer++;
            }
        }
        return answer;
//        int answer = 0;
//        int[] gameboard = new int[]{3, 6, 9};
////        for(int i =0 ; i<order)
//        for (int i = 0; i < order; i++) {
//            if (gameboard[i] % order == 0) {
//                answer++;
//            }
//        }
//        System.out.println(answer);
    }
}
