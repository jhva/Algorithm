package org.example.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class level2오픈채팅방 {
    public static void main(String[] args) {
        solve(
            new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
                "Change uid4567 Ryan"});
    }

    static void solve(String[] record) {
        String[] answer = {};
        List<String> result = new ArrayList<>();
        Map<String, String> id = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");


            if (str[0].equals("Enter")) {
                id.put(str[1], str[2]);
                result.add(str[1] + "님이 들어왔습니다.");
            } else if (str[0].equals("Leave")) {
                result.add(str[1] + "님이 나갔습니다.");
            } else {
                id.replace(str[1], str[2]);
            }
        }
        System.out.println(id);
        System.out.println(result);
        answer = new String[result.size()];

        for (int i = 0; i < result.size(); i++) {
            int index = result.get(i).indexOf("님");
            String name = result.get(i).substring(0,index);
            System.out.println(name);
            System.out.println(index);
            answer[i]=id.get(name)+result.get(i).substring(index);
        }

        System.out.println(Arrays.toString(answer));
    }

}

/**
 * 채팅방에서 닉네임을 변경하는 방법은 다음과 같이 두 가지이다.
 * <p>
 * <p>
 * 1. 채팅방을 나간 후, 새로운 닉네임으로 다시 들어간다.
 * 2. 채팅방에서 닉네임을 변경한다.
 */

// muzi1234 들어옴 prodo 4567들어옴 Muzi1234 나감  1234prodo들어옴 4567 ryan name change
// prodo1234 들어옴 ryan 4567들어옴 prodo1234 나감  1234prodo들어옴     ||| 4567 ryan name change
//
