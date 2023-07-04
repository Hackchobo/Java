package com.green.java.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        list.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        Map<String, Object> map = new HashMap(); // Map<String, String> 을 하고 뽑아낼때 형변환을 하면 된다.
        // 프론트엔드에서는 스트링으로 넘긴다. 웹개발에서는 <String, String> 을 사용해야 하며 new HashMap()을 사용 하는것을 알아야 한다.
        // 값을 넣을 때는 put, 빼낼때는 map을 사용한다.
        // 옵션 널 - 값이 없는 것을 만들고 싶을때
        // for문은 시퀀스가 있는 것만 된다.
        map.put("age", 27);
        map.put("name", "홍길동");
        map.put("height", 177.7);

        int age = (int)map.get("age");
        String name = (String)map.get("name");
        double height = (double)map.get("height");

        System.out.println("age : "+ age);
        System.out.println("name : "+ name);
        System.out.println("height : "+ height);

        map.forEach((key, value) -> { // 리퀴드 스타일의 시퀀스를 표현한다.
            System.out.printf("%s: %s\n",key, value);
        });
    }
}
