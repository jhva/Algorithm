package org.example.practice;

public class maxArrayFor {
    public static void main(String[] args) {
        int[] array = new int[] {11, 14, 13, 2};

        int max = array[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.println(max);
            }
        }
    }
}
