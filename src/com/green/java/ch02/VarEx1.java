package com.green.java.ch02;

public class VarEx1 {
    public static void main(String[] args) {
        int year = 0; // 정수의 이름을 year로 하고 정수값 0을 year로 초기화 해준다
        int age =14; // 변수명 age 타입은 int, 14값 대입(초기화)

        System.out.println(year); // 메소드
        System.out.println(age);

        year= age + 2000;
        age = age +1;

        System.out.println(year);
        System.out.println(age);
    }
}
