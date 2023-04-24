package com.green.java.ch06;

public class TvTest5 {

    static String brand;

    public static void main(String[] args) { // static이 있으면 값을 하나밖에 저장을 못한다.

        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        tv1.color = "black";
        tv2.color = "red";

        tv1.brand = "현대";
        tv2.brand = "기아";
        Tv.brand = "폭스바겐"; // 클래스로 하던 메소드로 접근을 하던 클레스 메모리 하나밖에 못저장한다.

        TvTest5.brand = "볼보";

        System.out.println("tv1.color = " + tv1.color);
        System.out.println("tv2.color = " + tv2.color);

        System.out.println("tv1.brand = " + tv1.brand);
        System.out.println("tv2.brand = " + tv2.brand);

        System.out.println("Tv.brand = " + Tv.brand);
        System.out.println("tvTest5.brand = " + TvTest5.brand);
    }
}
