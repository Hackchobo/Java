package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,100);
        System.out.println(list);
        list.add(0,300);
        System.out.println(list);

        int removeValue = list.remove(4); // list.remove(4) 4번방을 지우고, 값을 리턴한다.
        System.out.println("removeValue : "+removeValue);

        System.out.println(list);

        System.out.println(list.size()); // list.size() 값의 길이를 나타내준다.
    }
}
