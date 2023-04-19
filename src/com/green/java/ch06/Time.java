package com.green.java.ch06;

public class Time {
    private int hour;           // private 접근금지
    private int minute;         // class 안에 있는것은 전역 변수
    private int second;         // 멤버필드갯수에따라 저장할수있는 정수값 수가 달라진다.

    public int getHour() {
        return hour;
    }
            // get set 은 get은값을 달라는것 set은값을 셋팅하는것
    final int MAX = 24;         //따로 되있는 것은 지역변수
    final int MIN = 0;
    public void setHour(int hour) {
        if (hour<MAX && hour>MIN){
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
