package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest4 { //map 안에있는 값만 바뀌는 것이다., 원본은 건들지 않는다.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 100; i <= 120; i++) {
            list.add(i);
        }

        List<Integer> rList = list.stream().map(item -> item +4).toList(); // map은 무조건 담는다. 단 원본은 건들지 않는다.
        /*System.out.println(rList);
        System.out.println(list);*/

        MyArrayList ma = new MyArrayList();
        for (int i = 100; i <= 120; i++) {
            ma.add(i);
        }
        MyArrayList rMa = ma.map(item -> item +4);

        System.out.println(rMa);
    }
}
