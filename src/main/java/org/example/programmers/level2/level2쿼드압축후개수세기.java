package org.example.programmers.level2;

import java.util.Arrays;

public class level2쿼드압축후개수세기 {

   static int zero=0;
    static int one=0;

    static int[] answer = new int[2];

    public static void main(String[] args) {
        solve(new int[][] {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}});
    }

    static void solve(int[][] arr) {
        solution(arr);


        // answer = new int[2];
        //
        // visit = new boolean[arr.length][arr.length];
        //
        // for (int i = 0; i < arr.length; i++) {
        //     bfs(visit, arr, i);
        // }

    }
    public static int[] solution(int[][] arr) {
        rec(arr,arr.length,0,0);
        int[] answer = new int[]{zero,one};
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void rec(int[][] arr, int len, int x, int y){
        boolean flag=false;
        Loop:   for(int i=y;i<y+len;i++){
            for(int j=x;j<x+len;j++){
                if(arr[i][j]==arr[y][x]){
                    flag=true;
                }
                else{
                    flag=false;
                    break Loop;
                }
            }
        }
        if(flag){
            if(arr[y][x]==0) zero++;
            if(arr[y][x]==1) one++;
            return;
        }
        rec(arr,len/2,x,y);
        rec(arr,len/2,x+len/2,y);
        rec(arr,len/2,x,y+len/2);
        rec(arr,len/2,x+len/2,y+len/2);
    }

    // static void solution(int[][] arr, int x, int y, int size) {
    //     if (check(arr, x, y, size)) {
    //         answer[arr[x][y]]++;
    //         return;
    //     }
    //     // 1번 영역
    //     solution(arr, x, y, size / 2);
    //
    //     // // 2번 영역
    //     solution(arr, x + size / 2, y, size / 2);
    //     //
    //     // // 3번 영역
    //     solution(arr, x, y + size / 2, size / 2);
    //     // // 4번 영역
    //     // solution(arr, x + size / 2, y + size / 2, size / 2);
    // }
    //
    // static boolean check(int[][] arr, int x, int y, int size) {
    //     for (int i = x; i < x + size; i++) {
    //         for (int j = y; j < y + size; j++) {
    //             // 영역의 첫번째 값과 나머지를 비교하다 하나다로 다르면 반환
    //             if (arr[x][y] != arr[i][j]) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    //
    // }

}
