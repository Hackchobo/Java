package com.green.java.ch14;

import java.util.ArrayList;

public class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(item -> System.out.print(item+ ","));
        System.out.println();
        list.forEach(item -> System.out.print(item));
        for (int a: list) {
            System.out.printf("%d,",a);
        }
        System.out.println();
        list.removeIf(item -> item % 2==0 || item % 3 == 0);// 원본에서 짝수만 제거
        System.out.println(list);

        list.replaceAll(item -> item*10); // 원본을 건들여 버린다.
        System.out.println(list);
    }
}
