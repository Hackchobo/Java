package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a =10;
        Integer a2 = a;

        double d = 10.2;
        Double d2 = d;
        // <>를 제네릭이라고 한다. <타입> - 타입을 고정시켜서 타입에 맞는것만 나온다.
        ArrayList<Integer> list = new ArrayList<>();
//        list.add("11");
//        list.add(10.1);
//        list.add(true);
        list.add(10);   //추가하는 방법
        list.add(13);

        int n1 = list.get(0);       //빼는 방법
        System.out.println(list);//투스트링이 오버라이드되어있음
    }
}
