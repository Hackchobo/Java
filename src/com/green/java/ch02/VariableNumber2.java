package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {
        //리더럴 Literal, 값 그 자체!!
        //byte의 범위는 0~127 까지 이므로 128은 오버플로우 현상이 일어남.
        byte b1 = 127;
        System.out.println(b1);

        int i1 = 129;
        int i2 = b1; // 자동형변환
        if (i1 <= Byte.MAX_VALUE && i1 >= Byte.MIN_VALUE){
            b1 = (byte)i1;// 강제형변환
        }

        System.out.println(b1);

        b1 = (byte)-129;
        System.out.println(b1);
    }
}
