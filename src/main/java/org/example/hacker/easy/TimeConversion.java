package org.example.hacker.easy;

public class TimeConversion {
    public static void main(String[] args) {
        solve("12:45:54PM");
    }

    static void solve(String s) {

        String timeFormat = s.substring(s.length() - 2);
        String[] newString = s.split(":");
        String hour = newString[0];
        String ans = "";

        if (timeFormat.equals("PM")) {
            hour = hour.equals(String.valueOf(12)) ? hour : String.valueOf(Integer.parseInt(hour) + 12);
        } else if (timeFormat.equals("AM") && hour.equals(String.valueOf(12))) {
            hour = String.valueOf(0) + String.valueOf(0);
        }
        newString[0] = hour;

        ans = newString[0] + ":" + newString[1] + ":" + newString[2].substring(newString[2].length() - 4, newString[2].length() - 2);
        System.out.println(ans);
    }
}
