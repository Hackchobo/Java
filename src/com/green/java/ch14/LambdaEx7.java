package com.green.java.ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s, 16); // <앞에있는게 파라미터타입, 뒤에있는게 리턴타입> ,16진수 문자열 > 10진수 변환
        Function<Integer, String > g = i -> Integer.toBinaryString(i); // 10진수를 2진수 String으로 변경

        System.out.println(f.apply("f"));
        System.out.println(g.apply(999999999));

        Function<String, String> h = f.andThen(g);

        int r = f.apply("A"); //10
        System.out.println("r : "+ r);
        String r2 = g.apply(r);
        System.out.println("r2 : "+r2);

        System.out.println("h : "+h.apply("A"));

        Function<String, String> f2 = x -> x; // 항등 함수
        System.out.println(f2.apply("AAA"));

        System.out.println("------------------");


        Predicate<Integer> p = i -> i< 100; // <변수가 들어가는 파라미터 타이프
        //함수 function, 메소드 Method
        //함수는 홀로서기 가능하다. 메소드는 클래스안에 감싸져있다.
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r3 = i -> i % 2 == 0; // 짝수면 True
        Predicate<Integer> notP = p.negate();// 부정이 되며 True를 False로 한다
        System.out.println("p.test(99) : " + p.test(99));
        System.out.println("notP.test(99) : "+ notP.test(99)); // 200보다 크면서 짝수인 것

        Predicate<Integer> all = notP.and(q.or(r3));
        System.out.println("all.test(222) : " + all.test(222));
        System.out.println("all.test(199) : " + all.test(199));
        System.out.println("all.test(201) : " + all.test(201));

//        String str1 = "abc";
//        String str2 = "abc";
        String str1 = new String("abc");
        String str2 = new String("abc");

        Predicate<String> p2 = Predicate.isEqual(str1);
        System.out.println("p2.test(str2) : " + p2.test(str2));
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
    }
}
