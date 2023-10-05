package org.example.programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class level2전화번호목록 {
    public static void main(String[] args) {
        solve(new String[] {"12", "123", "1235", "567", "88"});
    }

    static void solve(String[] phone_book) {
        Map<String, String> map = new HashMap<>();
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], phone_book[i]);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j)))
                    answer = false;
            }
        }

        System.out.println(answer);
    }
}
