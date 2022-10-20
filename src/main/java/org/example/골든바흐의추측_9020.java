package main.java.org.example;

import java.util.Scanner;

public class 골든바흐의추측_9020 {
    public static boolean[] prime = new boolean[10001];


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        funPrime();

        int T = sc.nextInt(); // 몇줄받을지


        while (T-- > 0) {
            int n = sc.nextInt();

            int p = n / 2;
            int q = n / 2;

            while (true) {
                if (!prime[p] && !prime[q]) {
                    System.out.println(p + " " + q);
                    break;
                }

                p--;
                q++;
            }

        }
    }

    public static void funPrime() {


        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}
