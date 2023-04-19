package com.green.java.ch06;

public class MyMethodTest {

    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.sum(10,20);
        mm.sum(10,200);
        mm.sum(10,2000);
        mm.sum(10,20000); // sum method 를 호출했다. ->()를쳐주거나 하면안되고 그냥 써야된다.

        int result =mm.sum2(10,245);
        System.out.println("result : "+result);
    }
}
