package com.green.java.ch07;
// p.348, 접근 제어자
public class AccessModifier { // 클래스앞에는 public은 파일명이랑 똑같은 클래스명만 앞에 붙일수있다. 이랑 default만된다.
    /*
    private, default, protected, public
     */
    public static void main(String[] args) { // 메소드앞에는 전부가능
        ModifireTest mt1 = new ModifireTest(); // 멤버필드도 됨
        //mt1.num1 = 10;
        mt1.num2 = 20;
        mt1.num3 = 30;
        mt1.num4 = 40;
    }
}


