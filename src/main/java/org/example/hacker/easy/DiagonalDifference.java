package org.example.hacker.easy;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
     public static void main(String[] args) {
        //example input 
        List<List<Integer>> list = new ArrayList<>();
       solution(list);
    //original input  array

    //https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
        
    }

    public static int solution(List<List<Integer>> ar){
        int len =ar.size();
 
    
    int right = 0; 
    int left = 0; 
    for (int i = 0; i < len; i++) {
        left += ar.get(i).get(i);
        right += ar.get(i).get(len - 1 - i);
    }

    int diagonalDifference = Math.abs(left - right);
    return diagonalDifference;
    }
}
