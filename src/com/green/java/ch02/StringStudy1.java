package com.green.java.ch02;

public class StringStudy1 {
    public static void main(String[] args) {
        String str = "abcdefghijklmn";

        String r1 = str.substring(0,4);
        System.out.println(r1);

        String r2 = str.substring(3,6) ;
        System.out.println(r2);

        String r3 = str.substring(5); // 5번을 기점으로 자신을 포함해서 앞에 값을 잘라 버린다.
        System.out.println("r3 : "+r3);

        int idx = str.indexOf("g"); // 특정문자열의 위치를 알수가 있다.

        int len = str.length();
        System.out.println("len : "+len);

        char[] charArr = str.toCharArray(); // 딥카피해서 그것에 주소값을 준다.
        System.out.println(charArr[0]);
        System.out.println(charArr[1]);
        charArr[0] = '!';
        System.out.println(str);

    }
}
