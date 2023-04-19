package com.green.java.ch06;

public class MyMethod {

    //void > return type, 리턴 타입 - void는 반환되지않는다.
    //sum > method name, 메소드명
    //(int n1, int n2) >parameter, 파라미터, 매개 변수 - 값들이 들어가는 곳
    void sum(int n1, int n2)  // 선언부
    {System.out.println(n1+n2);return;} //구현부 = 정의라고 한다. return;은 안적어도 자동으로 된다.
    // 선언부와 구현부가 있으면 정의 라고한다.


    int sum2(int n1, int n2){ // 반환하는 타입을 맞춰야 된다.
    return n1+n2;
    }
}
