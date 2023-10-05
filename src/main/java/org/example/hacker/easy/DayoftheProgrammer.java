package org.example.hacker.easy;

public class DayoftheProgrammer {
    public static void main(String[] args) {
        solve(2017);
    }

    static void solve(int year) {
        int day;
        if (year == 1918) // 같으면  1918년 이후 윤년 256번째 날은 9월 12일이므로 1월 31일 다음 날 2월 14 일 즉 13일 그러면 243-13 = 230
            day = 256 - 230;
        else if (year < 1918) {
            if (year % 4 == 0)
                day = 256 - 244;
            else
                day = 256 - 243;
        } else {
            //윤년에 대한 조건
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                day = 256 - 244;

            else
                day = 256 - 243;
        }
        System.out.println(day + ".09." + year);
    }
}
