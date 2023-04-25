package com.green.java.ch07.poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog; // 형변환이 가능한지 판별해주려면 instanceof 를 사용하면 된다.
        System.out.println("r1 : "+r1);
        Bulldog bd1 = (Bulldog) ani1;

        System.out.println("r2 : "+ (ani1 instanceof Cat));
//        Cat c1= (Cat)ani1;
    }
}
