package main.java.org.example.programers;

public class level1숫자문자열과영단어 {

    public static void main(String[] args) {
        solution("one2three");
    }

    public static int solution(String S) {
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < 10; i++) {
            S = S.replace(word[i], num[i]);
        }
        System.out.println(Integer.parseInt(S));
        return Integer.parseInt(S);
    }
}
