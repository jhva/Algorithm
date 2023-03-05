package org.example.programmers.level1;

public class level1옹알이 {

    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        solve(babbling);
    }

    static void solve(String[] babbling) {

        int answer = 0;

        String[] tempArr = {"aya", "ye", "woo", "ma"};


        for (String babble : babbling) {

            int target = 0;
            String tempStr = "";
            boolean flag = true;
            while (flag) {
                int valueIdx = target;
                for (String temp : tempArr) {
                    if (babble.startsWith(temp, target) && !temp.equals(tempStr)) {
                        target += temp.length();
                        tempStr = temp;
                        break;
                    }
                }


                if (target == valueIdx) {
                    break;
                } else if (target == babble.length()) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
