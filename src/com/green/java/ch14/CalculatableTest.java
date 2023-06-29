package com.green.java.ch14;

public class CalculatableTest {
    public static void main(String[] args) {
        Calculatable cc = new Calculatable() { // 익명클래스가 생성되며 객체화되고 그것의 주소값이 나온다.
            @Override
            public int calc(int n1, int n2) {
                return n1 + n2;
            }
        };

        int result = cc.calc(10, 20);
        System.out.println("result : " + result);

        Calculatable cc2 = (n1, n2) /*생략 가능한것은 한개일때 () 생략 가능 단 0개이거나 2개이상일 경우 기입 */
                -> n1 + n2;/* 한줄일때 생략 가능*/ // int를 안적는 이유는 인터페이스에 있기때문이고 적는 다면 두개다 적어 줘야 한다. {} 를 생략 하면 1줄이여야 하며 리턴을 바로 해준다. 그리고 ;이 없어야 한다.
        int result2 = cc2.calc(20, 30);
        System.out.println("result2 : " + result2);


        Calculatable cc3 = (n1, n2) -> {
            return n1 + n2;

        };
        System.out.println("result3 : "+ cc3.calc(100,200));
    }
}
