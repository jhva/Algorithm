package org.example.search;


import java.util.Scanner;

import static org.example.search.SeqSearch.seqSearch;

class SeqSearch {
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;
        while (true) {
            if (i == n) {
                return -1;
            }
            if (a[i] == key) {
                return i;
            }
            i++;

        }
    }
}

public class LinearSearch {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);//처음에 몇개할지
        System.out.println("요소 수 ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            x[i] = stdIn.nextInt();
        }
        System.out.println("검색할 값");
        int searchKey = stdIn.nextInt();
        int inx = seqSearch(x, num, searchKey);
        if (inx == -1) {
            System.out.println("요소없음");
        } else {
            System.out.println("그 값은 x[" + inx + "]에 있음");
        }
    }
}
