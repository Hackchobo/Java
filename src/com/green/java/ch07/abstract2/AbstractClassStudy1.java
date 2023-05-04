package com.green.java.ch07.abstract2;

public abstract class AbstractClassStudy1 { // 클래스앞에 abstract를 붙히는게 추상클래스임
    //추상메소드가 있으면 무조건 abstract를 무조건 사용 해줘야됨,없으면 절대 사용가능하지않다.
    // 메모리에는 올리고싶은데 객체화가 안되게 하고싶으면 사용함
    // 강제성이 있다. 부모클레스가 강제성이 있다. ex) 무조건 오버라이딩해야함
    // 추상클래스는 무조건 자식클래스가 있다.
    // 기본생성자 앞에 프라이빗을 주면 객체생성을 못하게 할수있다.
    // 추상클래스가 없는 클래스라도 앱스트랙트를 붙일수있다. 하지만 객체화가 불가능해진다.
    // 클래스는 단일상속밖에 안된다. 인터페이스만 다중상속이 가능함
    int multi(int n1, int n2){
        return n1 * n2;
    }
    abstract void sum(int n1, int n2);//추상메소드만 호출 불가능, 또한 오버라이딩이 되야 사용 가능
}

class ChildClass extends AbstractClassStudy1 {

    @Override // 생략 가능
    void sum(int n1, int n2) {
        System.out.println("합계 : "+(n1+n2));
    } // {} 가있으면 구현부는 구현한거임
}

class Child2Class extends AbstractClassStudy1 {


    @Override
    void sum(int n1, int n2) {
        System.out.println("sum : "+(n1+n2));
    }
}