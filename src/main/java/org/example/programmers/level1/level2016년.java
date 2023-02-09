package org.example.programmers.level1;

public class level2016년 {
    public static void main(String[] args) {
        solve(5, 24);

    }

    static void solve(int a, int b) {
        String[] arr = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        String answer = "";
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
// arr date 1월은 31 1일은 FRI... 2월 29일 .. ..
        int index = 0;


        for (int i = 0; i < a - 1; i++) {
            index += date[i];
//a-1까지 다더하기
        }
        index += b - 1; // 1월1일이 금요일인데 b-1안하면 SAT이나옴
        System.out.println(arr[index % 7]); //144 % 7 = 4 윤년은 모든 일수에 % 7
        answer = arr[index % 7];
        System.out.println(index);


    }

//        int index = 0;
//        String answer = "";
//        while (index < 31) {
//            if (index == 2) {
//                 answer = arr[2];
//            }
//            index++;
//        }
//        System.out.println(answer);


}
