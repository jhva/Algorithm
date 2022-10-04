package main.java.org.example;

public class test {
    public static void main(String[] args) {
        testMethod(4);
    }

    public static void testMethod(int num) {

        if (num == 0) {
            return;
        }
        System.out.println("안녕하세요");

        testMethod(num - 1);
    }
}
