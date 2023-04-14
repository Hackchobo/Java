package com.green.java.ch03;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x = 10, y = -5, z=0;
        int absX, absY, absZ;

        absX = x>=0 ? x: -x; // x의값을 변경하려면 대입연산자 = 이 필요하다.

        System.out.println(absX);

        absY= y>=0 ? y :-y;
        System.out.println(absY);

        absZ= z>=0 ? z :-y;
        System.out.println(absZ);
    }
}
