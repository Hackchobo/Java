package com.green.java.ch07.poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog; // 형변환이 가능한지 판별해주려면 instanceof 를 사용하면 된다.
        System.out.println("r1 : "+r1);
        Bulldog bd1 = (Bulldog) ani1;

        System.out.println("r2 : "+ (ani1 instanceof Cat)); // 상속관계가 아니기 때문에 안된다. 형제 객체는 서로남이라고 보면 된다.
//        Cat c1= (Cat)ani1;
    }
}
