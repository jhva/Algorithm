package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

public class level2가장큰수 {

    static boolean[] visit;

    public static void main(String[] args) {
        solve(new int[] {6, 10,2});
    }

    static void solve(int[] numbers) {

        List<String> list = new LinkedList<>();

        for (int i : numbers) {
            String s = String.valueOf(i);
            list.add(s);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });

        StringBuilder answer = new StringBuilder();
        for (String s : list) {
            answer.append(s);
            if(s.equals("0")){
                answer.append(s);
                break;

            }
        }




        //맨처음 답
        // List<String> list = new LinkedList<>();
        //
        // String answer = "";
        // for (int i : numbers) {
        //     String s = String.valueOf(i);
        //     list.add(s);
        // }
        // Collections.sort(list, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o2.compareTo(o1);
        //     }
        // });
        // String a = "";
        // String b = "";
        // while (true) {
        //     for (int i = list.size() / 2; i <list.size() - 1; i++) {
        //         String listget = list.get(i);
        //         a += listget;
        //     }
        //     for (int j = list.size() - 1; j > list.size() / 2; j--) {
        //         String list2 = list.get(j);
        //         b += list2;
        //     }
        //     break;
        // }
        // System.out.println(list);
        // for (int i = 0; i < list.size(); i++) {
        //
        //     if (Integer.valueOf(a) < Integer.valueOf(b)) {
        //         String s1 = list.get(list.size() - 2);
        //         String s2 = list.get(list.size() - 1);
        //         list.remove(list.size() - 2);
        //         list.remove(list.size() - 1);
        //         list.add(s2);
        //         list.add(s1);
        //         answer += list.get(i);
        //     }else{
        //         answer+=list.get(i);
        //     }
        // }
    }

}
