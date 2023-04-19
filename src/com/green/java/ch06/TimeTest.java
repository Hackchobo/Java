package com.green.java.ch06;

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
        //hour 1~23
        System.out.println("hour: "+ t1.getHour());

        t1.setHour(1);
        t1.setHour(25);
        System.out.println("hour: "+ t1.getHour());



    }
}
