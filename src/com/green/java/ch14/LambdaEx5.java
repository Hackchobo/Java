package com.green.java.ch14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+2; // () 제공만 해주는 타입 , return이 자동으로 들어 간다.
        //Supplier, Consumer 는 인터페이스이다.
        //인터페이스를 사용하는 이유는 강제성, 부모로써의 역할(상속관계)
        // 람다식은 적게 적을수있게 한것이다. 람다식은 무조건 유추이다.

//        System.out.println(s.get());
//        System.out.println(s.get());
//        System.out.println(s.get());
//        System.out.println(s.get());

       // Consumer<Integer> c3 = new ConsumerImple();
        Consumer<Integer> c = i -> System.out.println(i); //Consumer를 implements 한것임
        Consumer<Integer> c4 = System.out::println; //21번라인과 똑같은 문장임,
        // 하나값만 받는다면 이문장을 사용 할수있게 된다.단. 두개를 찍으면 안된다.
        Consumer<Integer> c2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };

        int val = 9;
        Predicate<Integer> p1 = i -> i > 10; // 메소드이름은 Test인데 리턴타입이 불린이다. i의 타입은 스트링 이다.
        System.out.printf("%d > 10 : %b\n",val,p1.test(val)); // 객체의 주소값


        Function<Double, Integer> fn1 = dVal -> dVal.intValue();

        System.out.println(fn1.apply(10.5));
        System.out.println(fn1.apply(11.5121212));
        System.out.println(fn1.apply(11212.5328338));

        //Wrapper Type(기본타입(프라모티브 타입)을 감싸고있는 것 또는 나타내주는 것)
        //int > Integer
        //short > Short
        //long > Long
        //double > Double
        //float > Float

        Integer n1 = 10;
        int n2 = n1;
        Integer n3 = 20;
        n1= 20; // 새로운 색체주소값이 만들어 지는것이 아닌가 싶다?!?!?

        System.out.println(n1 == n3);

        String s1 = "안녕";
        String s2 = "안녕";

        System.out.println(s1 == s2);
    }
}
