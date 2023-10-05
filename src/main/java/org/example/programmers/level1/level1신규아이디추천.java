package org.example.programmers.level1;

public class level1신규아이디추천 {
    public static void main(String[] args) {
        soulution("...!@BaT#*..y.abcdefghijklm");

    }

    public static boolean isValid(char c) {
        //문자나 숫자는 유효한
        if (Character.isLetterOrDigit(c)) return true;
        if (c == '-' || c == '_' || c == '.') return true;
        return false;
    }

    public static String soulution(String user_id) {


        StringBuilder answer = new StringBuilder();

        boolean lastDot = false;

        for (char ch : user_id.toCharArray()) {
            if (isValid(ch) == false) continue;
            if (ch == '.') {
                if (answer.length() == 0 || lastDot) continue;
                lastDot = true;
            } else {
                lastDot = false;
            }
            ch = Character.toLowerCase(ch);
            answer.append(ch);
            System.out.println(answer + "잉");
        }
        if (answer.length() >= 16) answer.setLength(15);
        if (answer.length() == 0) answer.append('a');
        if (answer.charAt(answer.length() - 1) == '.') answer.deleteCharAt(answer.length() - 1);
        if (answer.length() <= 2) {
            char ch = answer.charAt(answer.length() - 1);
            while (answer.length() < 3) {
                answer.append(ch);
            }
        }
        return answer.toString();
    }

}
