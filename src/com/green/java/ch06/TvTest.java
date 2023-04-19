package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {
        String str = new String("dd");
        Tv tv = new Tv(); // Tv 주소값만 저장할수있는 레퍼런스 변수 Tv를 new로 객체화 한다.
        System.out.printf("power : %b\n",tv.power);   // 객체에 접근할수있도로 하는 것이 '.' 이다.
        System.out.printf("power : %d\n",tv.channel);

        tv.power = true;
        System.out.printf("power : %b\n", tv.power);
        tv.power(); //Tv 메소드를 호출했다.
        System.out.printf("power : %b\n", tv.power);

        tv.setChannelUP();
        tv.setChannelUP();
        System.out.printf("channel : %d\n", tv.channel);
        tv.channel = 10;
        System.out.printf("channel : %d\n", tv.channel);

        Tv tv2 = tv;
        System.out.printf("channel : %d\n", tv2);
    }
}
