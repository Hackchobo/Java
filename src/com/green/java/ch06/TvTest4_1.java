package com.green.java.ch06;

public class TvTest4_1 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        Tv tv = new Tv(); // 객체를 한번 만 만들었다.

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = tv;  // 주소값을 복사하는 게 '=' 이다. 같은 주소값을 가르킨다.
            tvArr[i].channel =10;
        }

        tv.channel = 1;
        System.out.println(tvArr[0].channel);
        System.out.println(tvArr[1].channel);
        System.out.println(tvArr[2].channel);
        System.out.printf("%d\n",tvArr[1].channel);

        String str = "dd";
        for (int i = 0; i < tvArr.length; i++) {
            System.out.println(tvArr[i]);
        }
        System.out.println(tv);
    }
}
