package com.green.java.ch07.poly;
// p.354 다형성, 상속관계에서만 의미있음
public class Poly {
    /*
        1. 부모타입은 자식 객체 주소값 저장할 수 있다.
        2. 자식타입은 부모 객체 주소값 저장할 수 없다. ->부모보다 클수밖에 없어서 안된다.
        3. 타입은 (알고 있는 메소드만 호출할 수 있음)
                 (메소드를 호출할 수 있나없나만 결정)
                 >> 실제로 실행되는 건 객체 기준이다.

                 다중상속을 허용하지 않는 이유 - 다중상속을 하였을경우 자식타입의 같은이름을 호추할경우 오류가 발생할수있기 때문이다.
     */
    public static void main(String[] args) {
        Animal ani1 = new Dog(); // 자식 타입은 부모 객체의 주소값을 저장 못함
        ani1.crying();      // 자식 객체부터 살펴보고 부모객체 부모객체 살펴보고 할머니객체
        // ani1.jump();

//        Dog dog1 = new Animal();
        ani1 = new Animal();
        Dog dog1 = (Dog)ani1; // 주소값을저장한것이 아닌 객체를 저장한것이므로 사용가능
        dog1.crying();
        dog1.jump();
    }
}
