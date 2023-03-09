//package org.example.homework;
//
//import java.util.*;
//
//public class 가장흔한단어찾기 {
//    public static void main(String[] args) {
//        solve("a, a, a, a, b,b,b,c, c", new String[]{"a"});
//    }
//
//    static void solve(String paragraph, String[] banned) {
//        String[] str = paragraph.toLowerCase().trim().split(" ");
//        String answer = "";
//        List<String> liststr = new ArrayList<>();
////        Map<String, Integer> map = new HashMap<>();
//        HashMap<String, Integer> map = new HashMap<>();
//        String ban = "";
//        for (String temp : banned) {
//            ban = temp;
//        }
//        int len = ban.length();
//        String answer1 = "";
//        for (int i = 0; i < str.length; i++) {
////            if(str[i].equals())
////            System.out.println(str[i]);
//
//            if (str[i].equals(ban)) continue; // banned가 있으면 그냥 건너뛰고 list에 넣어준다
////            System.out.println(str[i]);
//            String re = "";
//            for (int j = 0; j < str[i].length(); j++) {
//                int c = str[i].charAt(j);
//                if (c == 32 || c == 44 || c == 33 || c == 39 || c == 63 || c == 59 || c == 46) continue;
//                    //32번공백
//                else {
//
//                    re += String.valueOf((char) c);
//                }
//            }
//            liststr.add(re);
//        }
//        String answe3r = "";
//        for (String tempStr : liststr) {
//            if (Objects.equals(tempStr, ban)) continue;
//            answe3r += tempStr;
//        }
//
//        for (int i = 0; i < answe3r.length(); i++) {
//            int cnt = 0;
//            for (int j = 0; j < answe3r.length(); j++) {
//                if (answe3r.charAt(i) == answe3r.charAt(j)) {
//                    cnt++;
//                }
//            }
//            map.put(String.valueOf(answe3r.charAt(i)), cnt);
//        }
//
//        int max = Collections.max(map.values());
//
//        for (String key : map.keySet()) {
//            if (map.get(key).equals(max)) {
//                answer = key;
//                break;
//            }
//        }
//
//
//        System.out.println(answer);
//
////        for(int i=0; i<str.length(); i++) {
//
////        }
//
////        for (int i = 0; i < liststr.size(); i++) {
////            int cnt = 0;
////            for (int j = 0; j < liststr.size(); j++) {
////                if (liststr.get(i).equals(liststr.get(j))) {
////                    cnt++;
////                }
////            }
////            map.put(liststr.get(i), cnt);
////        }
////        int max = Collections.max(map.values());
////
////        for (String key : map.keySet()) {
////            if (map.get(key).equals(max)) {
////                answer = key;
////                break;
////            }
////        }
//    }
//
////    private static void check(String str, String ban) {
////        List<String> list = new ArrayList<>();
//////        System.out.println(str);
////        String re = "";
////        for (int i = 0; i < str.length(); i++) {
////            int c = str.charAt(i);
////            if (c != 33 || c != 39 || c != 63 || c != 44 || c != 59 || c != 46) {
////                re += str;
////            }else{
////
////            }
////
////        }
////
////        System.out.println(re);
//////        System.out.println(str);
//////        System.out.println(list);
////    }
//}
//
package org.example.homework;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class 가장흔한단어찾기 {
    public static void main(String[] args) {
        solve("a, a, a, a, b,b,b,c, c", new String[]{"a"});
//        "a, a, a, a, b,b,b,c, c", new String[]{"a"}
        //Bob hit a ball, the hit BALL flew far after it was hit.

    }

    static void solve(String paragraph, String[] banned) {
//영문자만제외하고는 다 공백 으로해주겟다
        String[] str = paragraph.replaceAll("[^a-zA-Z]", " ").split(" ");
        // 특수문자등등은 공백처리  테스트케이스 a, a, a, a, b,b,b,c, c", new String[]{"a"}
        System.out.println(Arrays.toString(str));
        Map<String, Integer> map = new HashMap<>(); //밴당한 위치를 제외한 key value형태의 단어의 빈도수를 넣어줄려고 .
        List<String> listbanned;

        String answer = "";

        listbanned = Arrays.asList(banned);
        //asList는 추가나 삭제할수가없음 추가할시 unsupportedOperationException이뜸

        for (int i = 0; i < str.length; i++) {
            int cnt = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) cnt++;
            }

            if (!listbanned.contains(str[i])) { // "Bob. hIt, baLl",   "bob", "hit" 여기 이테스트케이스에d서
                // 공백도 들어가기때문에 밑에서 answer.equals("")를 한이유다
                map.put(str[i], cnt);
            }
        }

        System.out.println(map);

        for (String key : map.keySet()) {//모든 키값
            if (answer.equals("")) {// "Bob. hIt, baLl",   "bob", "hit"  이 테스트케이스에서 발생해서 코드를 넣어주었다.
                //이유는 공백때문이다

                answer = key; // key가 공백이기때문에 다음값이 정답이될수밖에없다. "Bob. hIt, baLl",   "bob", "hit"
            } else {
                // 첫번째값은 무조건 answer를 통해들어오니까 value값이 다음 키 값보다 더 크면 answer 작으면 key
                answer = map.get(answer) > map.get(key) ? answer : key;
            }
        }
    }
}


