package org.example.programmers.level2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class level2파일명정렬 {
    public static void main(String[] args) {

        solve(new String[] {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"});
    }

    static void solve(String[] files) {

        Arrays.sort(files, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String head1 = s1.split("[0-9]")[0];
                String head2 = s2.split("[0-9]")[0];
                s1 = s1.replace(head1, "");
                s2 = s2.replace(head2, "");

                head1 = head1.toLowerCase();
                head2 = head2.toLowerCase();

                // compareTo(x, y) => [ -1 : x < y | 0 : x == y | 1 : x > y ]
                int headCompareValue = head1.compareTo(head2);
                if (headCompareValue == 0) {

                    // head정렬 값이 같으므로 number로 정렬
                    String num1 = "";
                    for (char c : s1.toCharArray()) {
                        if (!(c >= '0' && c <= '9')) break;
                        num1 += c;
                    }
                    String num2 = "";
                    for (char c : s2.toCharArray()) {
                        if (!(c >= '0' && c <= '9')) break;
                        num2 += c;
                    }

                    return (Integer.parseInt(num1) - Integer.parseInt(num2));

                } else {
                    System.out.println(headCompareValue);
                    // System.out.println(headCompareValue);
                    return headCompareValue;
                }
            }
        });
        System.out.println(Arrays.toString(files));
        // String[] answer = files;
        //
        // HashMap<String, Integer> sum = new HashMap<>();
        // for (int i = 0; i < files.length; i++) {
        //     int sumthis = 0;
        //     for (int j = 0; j < files[i].length(); j++) {
        //         int s = files[i].toLowerCase().charAt(j);
        //
        //         sumthis += s;
        //     }
        //     sum.put(files[i], sumthis);
        //     // sum.add(sumthis);
        // }
        //
        // System.out.println(sum);
        // //
        // System.out.println(sum);
        // List<String> list = new ArrayList<>(sum.keySet());
        //
        // Collections.sort(list, (v1, v2) -> (sum.get(v1).compareTo(sum.get(v2))));
        //
        //
        // for (String key : list) {
        //     System.out.println(key + " : " + sum.get(key));
        // }

        // }
    }
}
