package com.green.java.ch14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5_1 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1; // 1 ~ 100
        Consumer<Integer> c = i -> System.out.print(i+ ", "); // 값이 들어오면 값을찍고 , 를 찍어주는 구문이다.
        Predicate<Integer> p = i -> i % 2 == 0; // 짝수인지 판별해주는 구문
        Function<Integer, Integer> f = i -> i /10 * 10; // 1의자리를 없애고 리턴하는 구문이다.
        List<Integer> list = new ArrayList();
        makeRandomList(s, list); // 10개의 랜덤한 값을 list에 추가해주는 메소드
        printEvenNum(p, c, list); // 세개의 정보를 보내고 한개마다 p를 이용해서 체크하고 True이면 출력

        List<Integer> newList = doSomething(f, list); // 새로운배열을 만드는데 1의 자리를 비워두고 배열 생성
        System.out.println(newList);

        List<Integer> newList2 = doSomething2(f, list);
        System.out.println(newList2);

    }

    public static void makeRandomList(Supplier<Integer> supplier, List<Integer> list){
        for (int i = 0; i < 10; i++) {
            list.add(supplier.get());
        }
    }

    public static void printEvenNum(Predicate<Integer> p, Consumer<Integer> c, List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (p.test(list.get(i))){
                c.accept(list.get(i));
            }
        }
    }

    public static List<Integer> doSomething(Function<Integer, Integer> f, List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(f.apply(list.get(i)));
        }
        return list1;
    }

    public static <T> List<T> doSomething2(Function<T, T> f, List<T> list) {
        return list.stream().map(f).toList();
    }
}
