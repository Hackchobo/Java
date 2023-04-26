package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // 대괄호 안씀, 값이 아무거나 다들어 간다. 오브젝트타입은 숫자도가능하고 뭐든 가능하다.
        list.add(10); //0번방
        list.add(20); //1번방
        list.add("ddd");

        Object obj = 10;

        System.out.println(list.get(0)); // 0번방 호출함
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        int n1 = (int)list.get(0); // 오브젝트타입이므로 강제로 형변환을 해줘야 한다.
        int n2 = (int)list.get(1); // 오브젝트타입이므로 강제로 형변환을 해줘야 한다.
        String str1 = (String) list.get(2); // 오브젝트타입이므로 강제로 형변환을 해줘야 한다.

    }
}
