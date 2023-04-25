package com.green.java.ch07;

public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println(p.x);
        System.out.println(c.x);

        // 메소드는 객체기중이라서 자식부터 찾고 그다음에 부모필드를 찾아간다.
    }
}

class Parent2 {
    int x = 100;
    void method(){
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2{
    int x = 200;
    void method(){
        System.out.println("Child Method");
    }
}