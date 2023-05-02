package com.green.java.ch06;

import java.io.PrintStream;

public class MyMethodTest {

    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.sum(10,20);
        mm.sum(10,200);
        mm.sum(10,2000);    //void는 변수를 지정할수없다.
        mm.sum(10,20000); // sum method 를 호출했다. ->()를쳐주거나 하면안되고 그냥 써야된다.

        int result =mm.sum2(10,245);
        System.out.println("result : "+result); //S .out .prin > chainnig 체이닝 기법이라고 한다.

        String str = " a_b_다_라_마바 ";
        String r1 = str.trim().replace("_","*").toUpperCase();
        System.out.println(r1);

        "a_b_다_라_마바".replace("_","*");

        String r2 = "a*b*다*라*마바".toUpperCase();
        System.out.println(r2);


        PrintStream ps = System.out; // PrintStream 객체만 담을수있다.
        //System.out = null;
        ps.println("result2 : " + result);
    }
}
