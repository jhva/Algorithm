package main.java.org.example.search;


import java.util.Scanner;


/**
 * 이진 검색
 * 이진검색은 애초에 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘이다 .
 */
public class BinarySearch {

    static int BinSearch(int[] a, int n, int key) {
        // n = 요소의 개수
        // 배열7
        // A에서 key 와 같은 요소르ㅜㄹ 검색
        int pl = 0; //검색 범위의 첫 인덱스
        int pr = n - 1; // 검색 범위에 끝 인덱스
        //4
        do {

            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            //2
            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1; //검색 범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc - 1;
        } while (pl <= pr);
        return -1; //검색 종료
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] searchArray = new int[number];
        System.out.println("오름차순으로 등록");
        searchArray[0] = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            do {
                System.out.println("x[" + i + "]");
                searchArray[i] = scanner.nextInt();
            } while (searchArray[i] < searchArray[i - 1]);
        }
        System.out.println("검색할 값");
        int result = scanner.nextInt();
        int indx = BinSearch(searchArray, number, result);
        if (indx == -1)
            System.out.println("그 값의 요소가없음");
        else
            System.out.println("그 값은 x[" + indx + "] 있음");
    }
}


