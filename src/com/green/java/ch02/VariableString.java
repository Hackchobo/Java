package com.green.java.ch02;

public class VariableString {
    public static void main(String[] args) {
        //대문자로 시작되는 변수의 값은 주소값이다.
        String s1 ="Hello";
        String s2 ="World";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + s2;
        //String s3 = "HelloWorld";
        System.out.println(s3);

        String s4 = s1 + " " + s2;
        System.out.println(s4);


    }
}
