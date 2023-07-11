package com.green.java.ch14;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class RefMethod1 {
    public static void main(String[] args) {
        Function<String, Integer> f = s-> Integer.parseInt(s);

        Function<String, Integer> f2 = Integer::parseInt;

        System.out.println("f.apply(10) : " + (f.apply("10")+10));
        System.out.println("f.apply(20) : " + (f.apply("20")+10));

        BiFunction<String, String, Boolean> f3 = (s1,s2) -> s1.equals(s2);

        String s1 = new String("Hello");
        String s2 = new String("Hello2");
        System.out.println("f3.apply(s1, s2) :" + f3.apply(s1, s2));

        BiFunction<String, String, Boolean> f4 = String::equals; // 문자열 비교는 문자열이 두개가 필요하기 때문에 사용 가능한걸로 보인다.

        BiPredicate<String, String> p1 = String::equals;
        System.out.println("f4.apply(s1, s2) : "+ f4.apply(s1, s2));
        System.out.println("p1.test(s1, s2) : "+ p1.test(s1, s2));
    }
}

class MyClass{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}