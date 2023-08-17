package org.example.hacker.easy;

import java.util.List;

public class Staircase {
    //https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

     public static void main(String[] args) {
            solution(6);
    }

    public static void solution(int n){
    
        for(int i =1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
