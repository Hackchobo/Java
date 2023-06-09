package com.green.java.ch07;

public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2(); //메소드 입장에서는 타입은 담을수있는지 없는지만 결정
        Child2 c = new Child2();

        System.out.println(p.x);
        p.method();
        System.out.println(c.x);
        c.method();

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
    @Override // 오버라이딩이맞는지 확인 해주는 작업임(실수방지용을 붙히면 확인가능)
    void method(){
        System.out.println("Child Method");
    }
}