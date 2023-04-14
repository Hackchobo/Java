package com.green.java.ch02;

public class VariableTest {
    public static void main(String[] args) {
        // 정수값과 스트링 이 있으면 스트링이 먼저 계산됨
        String r1 = "안녕" + 1 + 1;         // 문자열이 우선이 된다.
        System.out.println(r1);
        String r2 = "안녕" +( 1 + 1);
        System.out.println(r2);
        String r3 = 1+ 1 + "안녕";
        System.out.println(r3);

    }
}
