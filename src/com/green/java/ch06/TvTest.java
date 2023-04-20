package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {
        String str = new String("dd");      //new 객체화시키는 단어(인스턴스)
        Tv tv = new Tv(); // 대문자로 시작하는 타입은 객체를 저장한다.-> Tv 주소값만 저장할수있는 레퍼런스 변수 Tv를 new로 객체화 한다.
        System.out.printf("power : %b\n",tv.power);   // 객체에 접근할수있도로 하는 것이 '.' 이다.
        System.out.printf("power : %d\n",tv.channel);

        tv.power = true;
        System.out.printf("power : %b\n", tv.power);
        tv.power(); //Tv객체에 있는 메소드를 호출했다.
        System.out.printf("power : %b\n", tv.power);

        tv.setChannelUP(); // 소문자 tv는 변수명이므로 상관없다.
        tv.setChannelUP();
        System.out.printf("channel : %d\n", tv.channel);
        tv.channel = 10;
        System.out.printf("channel : %d\n", tv.channel);

        Tv tv2 = tv; // 주소값을 tv2에 tv의 주소값을 얕은복사를 하였다.
        System.out.printf("channel : %d\n", tv2);
    }
}
