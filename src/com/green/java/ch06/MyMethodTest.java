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

        PrintStream ps = System.out;
        ps.println("result2 : " + result);
    }
}
