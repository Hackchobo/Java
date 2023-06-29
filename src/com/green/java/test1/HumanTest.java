package com.green.java.test1;

public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human(); // 생성자를 호출한것임 (기본생성자를 호출함) 컴파일러가 자동으로 생성해줌
        h1.setName("홍길동");
        h1.setAge(10);

        h1.setName("신사임동").setAge(10);
    }
}
