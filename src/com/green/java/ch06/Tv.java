package com.green.java.ch06;

public class Tv {  // 임의로정한 네임이지만 선언하는 순간 타입이자 객체의 이름이된다., 사용자 정의 클래스라고 한다.
    String color;
    boolean power;
    int channel;

    void power() { power = !power;} // 실행을 한번하였을때 true이다가 다시실행하면 false 다시실행하면 true
    void setChannelUP() { ++channel;}
    void channelDown(){--channel;}

}
