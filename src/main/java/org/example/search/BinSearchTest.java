package main.java.org.example.search;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class BinSearchTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("요쇼ㅗ개수 입력");
        int num = scanner.nextInt();
        int arrayX[] = new int[num];
        System.out.println("오름차순으로 입력");
        arrayX[0] = scanner.nextInt();
        System.out.println(arrayX);
        for (int i = 1; i < num; i++) {
            do {
                arrayX[i] = scanner.nextInt();
            } while (arrayX[i] < arrayX[i - 1]);
        }
        System.out.println("검색할 값 ");
        int resultKey = scanner.nextInt();
        int idx = Arrays.binarySearch(arrayX, resultKey);
        if (idx < 0) {
            System.out.println("요속 없음");

        } else
            System.out.println("x[" + idx + "]");
    }
}
