package com.green.java.ch02;

public class Naming {                       //무조건 파스칼 케이스

    //p.25~26
    public static void main(String[] args) {
        //단어 +단어+ 단어

        //Hello World Bye
        //기법
        //파스칼 케이스 기법 > 클래스명
        String HelloWorldBye;

        //카멜 케이스 기법 > 변수명, 메소드명
        String helloWorldBye;

        //스네이크 케이스 기법(자바에서는 잘안씀)
        String hello_world_bye;

        //케밥 케이스 기법(자바에서 안씀
        //String hello-world-bye;

        //이름에 올수있는 특수기호 2개 : _, $  (_는 문자로 사용)
        String _hi, h$1;

        //이름 처음에 숫자 사용할 수 없다. but 처음만 아니면 된다.
        //String 1aa;
        String a1a;

        //이름에 빈칸 사용할 수 없다.
        //Sting hello world;

        //대소문자 구분
        String aaa;
        String aAa;
        String aaA;

        //예약어 사용 금지 (파랑색상 단어는 예약어)
        //String public;
        String pUblic;

        //상수는 전부 대문자, 스네이크 케이스 기법
        final int MY_NUM =13;
        // NUM = 20;
    }
}
