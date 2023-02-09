package org.example.programmers.level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level1크기가작은부분문자열 {
    public static void main(String[] args) {
        solve("3141592", "271");
    }

    static void solve(String t, String p) {
        int cnt = 0;
        int len = t.length() - p.length() + 1;
        String[] str = new String[len];


        for (int i = 0; i < len; i++) {
            str[i] = t.substring(i, p.length() + i);
            //0 3 1 4 2 5  짤라서넣어주고
            if (Long.parseLong(str[i]) <= Long.parseLong(p)) {
                //작으면
                System.out.println(str[i]);
                cnt++;
            }
//            System.out.println(t.substring(i, p.length()_!));
        }
        System.out.println(Arrays.toString(str));

//        List<Integer> arr = new ArrayList<Integer>();
//        int equlsStr = Integer.parseInt(p); // 비교대상
//        for (int i = 0; i < t.length(); i++) {
//            arr.add((int) t.charAt(i) - 48);
//        }
//
//        int index = 0;
//        int cnt = 0;
//        System.out.println(arr);
//        String sum = "";
//        int value = 0;
//
//        while (index < arr.size()) {
//        int vallue = arr.get(p.length() % 10);
//            System.out.println(vallue);
//
//            index++;
//        }
////
////        for (int i = 0; i < p.length() % 10; i++) {
//////            System.out.println(i);
////        }
//
//        sum += value;
//        if (Integer.parseInt(sum) < equlsStr) {
//            cnt++;
//        }
//        while (index < arr.size() ) {
//            int startIndex = arr.get(index);
//            int middleIndex = arr.get(index + 1);
//            int endIndex = arr.get(index + 2);
//            sum = "" + startIndex + middleIndex + endIndex;
//            if (Integer.parseInt(sum) < equlsStr) {
//                cnt++;
//            }
//            index++;
//
//        }

//        System.out.println(cnt);


    }
}
