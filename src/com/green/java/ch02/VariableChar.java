package com.green.java.ch02;

public class VariableChar {
    public static void main(String[] args) {
        //변수 선언과 초기화 동시가능
        char c1 = 'A'; // 문자, 문자열x, 홀따옴표사용.
        System.out.println(c1);

        c1 = '한';
        System.out.println(c1);

        c1 = 'C';
        System.out.printf("%c : %d \n", c1, (int)c1);
    }
}
