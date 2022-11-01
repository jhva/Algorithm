package org.example.재귀;


import java.util.Scanner;


public class 재귀의귀재_25501 {
    //    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//    }
    static int n;

    public static int recursion(String s, int l, int r) {
        n++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TEXT = sc.nextInt();
        for (int i = 0; i < TEXT; i++) {
            n = 0;
            System.out.println(isPalindrome(sc.next()) + " " + n);
        }
        sc.close();

    }
}
