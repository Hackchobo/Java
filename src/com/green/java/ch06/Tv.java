package com.green.java.ch06;

public class Tv {  // 임의로정한 네임이지만 선언하는 순간 타입이자 객체의 이름이된다., 사용자 정의 클래스라고 한다.
    String color;           //초기값은 null 이다. 대문자로 시작되는대부분의 타입은 null이다.
    boolean power;          // 멤버필드는 주로 위에 적는다.
    int channel;            // 초기값은 0이다.

    void power() { power = !power;} // 실행을 한번하였을때 true이다가 다시실행하면 false 다시실행하면 true
    void setChannelUP() { ++channel;}       //메서드
    void channelDown(){--channel;}

}
