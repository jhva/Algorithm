package org.example.programmers.level2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class level2최대값과최솟값 {
    public static void main(String[] args) {
        solve("1 2 3 4");
    }

    static void solve(String s) {
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println(min + " " + max);


    }
    /**
     *  아 이렇게할껄
     *
     *       String[] arrStr = str.split(" ");
     *         int[] arrInt = new int[arrStr.length];
     *         int i=0;
     *         for(String part : arrStr){
     *           arrInt[i] = Integer.parseInt(part);
     *           i++;
     *         }
     *
     *         StringBuffer sb = new StringBuffer();
     *         sb.append(Arrays.stream(arrInt).min().getAsInt());
     *         sb.append(" ");
     *         sb.append(Arrays.stream(arrInt).max().getAsInt());
     *
     *         return sb.toString();
     */
}
