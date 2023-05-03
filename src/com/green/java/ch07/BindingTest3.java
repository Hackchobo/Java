package com.green.java.ch07;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p= new Child3();
        Child3 c = new Child3();

        p.method();
        c.method();
        c.method(5);

    }
}

class Parent3 {
    protected int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3 {
    private int x= 200;
    void method(){
        super.method();
        System.out.println("Child Method");

    }

    void method(int x) {            // () 안에있는 걸 파라미터라고한다.
        System.out.println("x = " + x); //가장 가까운 x의 값을 가져온다.
        System.out.println("super.x = " +super.x); // 부모의 주소값 x 라는 뜻
        System.out.println("this.x = " + this.x); // 자식의 주소값 x 라는 뜻
    }
}
