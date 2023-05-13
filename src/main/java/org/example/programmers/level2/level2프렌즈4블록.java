package org.example.programmers.level2;

public class level2프렌즈4블록 {
    public static void main(String[] args) {
        String[] str = new String[] {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        solve(4, 5, str);
    }

    static void solve(int m, int n, String[] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {

            for(int j=i+1; j< board.length; j++){
                char s = (char)board[i].charAt(i);
                char t =(char)board[j].charAt(j);



                // System.out.println(s);
                // System.out.println(t);

            }



        }

    }
    static void check(int start){

        System.out.println(start);

    }
}
