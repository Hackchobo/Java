package com.green.java.ch07;

public class ChildTest {
    public static void main(String[] args) {
        Child ch = new Child(76);
        // Object는 자바의 최상위 객체임, toString(), equals() 가 들어 가있다.


        ch.play();
        ch.age = 10;
        System.out.println(ch.age);
        ch.play();

        GrandChild gc = new GrandChild();
        gc.age = 20;
        gc.play();

    }
}
