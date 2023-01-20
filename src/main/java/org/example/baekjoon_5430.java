package org.example;

import java.util.*;

public class baekjoon_5430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String p = sc.next();
            int n = sc.nextInt();

            String arrStr = sc.next();
            Deque<Integer> deque = new LinkedList<>();
            for (String s : arrStr.substring(1, arrStr.length() - 1).split(","))
                if (!s.equals("")) {
                    deque.add(Integer.valueOf(s));
                }
            System.out.println(check(deque, p));
        }
    }

    static String check(Deque<Integer> deque, String str) {
        boolean reverse = false;

        for (char command : str.toCharArray()) {
            if (command == 'R')
                reverse = !reverse;
            else {
                if (deque.size() == 0)
                    return "error";

                if (reverse) {
                    deque.removeLast();

                } else
                    deque.removeFirst();
            }
        }

        StringBuilder sb = new StringBuilder("[");
        while (!deque.isEmpty()) {
            sb.append(reverse ? deque.removeLast() : deque.removeFirst());
            if (deque.size() != 0) {

                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

}
//
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt(); // 얼마나돌지
//
//
//        for (int i = 1; i <= T; i++) {
//            Deque<Integer> arr = new LinkedList<>();
//
//            String str = sc.next();
//            int N = sc.nextInt();
//
//            String strArr = sc.next(); // 수행할 함수 구문
//
//            for (String s : strArr.substring(1, strArr.length() - 1).split(",")) {
//                if (!s.equals("")) {
//                    arr.add(Integer.valueOf(s));
//                }
//                System.out.println(check(arr, str));
//            }
//        }
//    }
//
//    static String check(Deque<Integer> deque, String arr) {
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuffer sb = new StringBuffer();
//
//
//        for (int i = 0; i < T; i++) {
//
//            boolean direction = true;
//            boolean error = false;
//
//
//            String strFunction = sc.next();
//            int N = sc.nextInt(); //배열에 돌 수
//            String str = sc.next();
//            str = str.substring(1, str.length() - 1); // 다 짤라 주고
//            String[] strArr = str.split(",");// 문자 열 받는 함수
//
//
//            if (str != "") {
//                for (int j = 0; j < strArr.length; j++) {
//                    arr.add(Integer.parseInt(strArr[j])); //짤른 index 값을 Deque arr에 add 해주자
//                }
//            }
//
//
//            for (int k = 0; k < strFunction.length(); k++) {
//                switch (strFunction.charAt(k)) {
//                    case 'R':
//                        direction = !direction;
////                    if (arr.isEmpty()) {
////                        System.out.println("error");
////                    }
////                        Collections.reverse((List<Integer>) arr);
//                        break;
//                    case 'D':
//                        if (!arr.isEmpty()) {
//                            if (direction) {
//                                arr.pollFirst();
//                            } else {
//                                arr.pollLast();
//                            }
//                            break;
//                        } else {
//                            error = true;
//                            break;
//                        }
//                    default:
////                        arr.remove(arr.peek());
//                        break;
//                }
//                if (error) {
//                    break;
//                }
//
//            }
//            if (error) {
//                //비어있을때 error 를 표출해주기위해서 문자열
//                sb.append("error").append("\n");
//            } else {
//                sb.append("[");
//                if (direction) {
//                    while (!arr.isEmpty()) {
//                        sb.append(arr.pollFirst());
//                        if (arr.isEmpty())
//                            break;
//                        sb.append(",");
//                    }
//                } else {
//                    while (!arr.isEmpty()) {
//                        sb.append(arr.pollLast());
//                        if (arr.isEmpty())
//                            break;
//                        sb.append(",");
//                    }
//                }
//                sb.append("]").append("\n");
//            }
//
//
////
////            int arrlen = Integer.parseInt(br.readLine());
////            for (int j = 0; j < arrlen; j++) {
////                arr.add(Integer.parseInt(br.readLine()));
////                //값 넣었고 .
////                check(str, arr);
////                System.out.println(arr.size() == 0 ? "error" : arr);
////            }
//        }
//        System.out.println(sb);
//    }


