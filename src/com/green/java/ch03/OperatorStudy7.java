package com.green.java.ch03;

public class OperatorStudy7 {
    public static void main(String[] args) {
        //미만, 초과 <>
        //이하, 이하 <=, =>

        System.out.println("2 < 2 : " + (2<2));
        System.out.println("1 < 2 : " + (1<2));
        System.out.println("2 <= 2 : " + (2<=2));
        System.out.println("1 <= 2 : " + (1<=2));
        System.out.println("2 > 2 : " + (2>2));
        System.out.println("2 >= 2 : " + (2>=2));
        System.out.println("2 == 2 : " + (2==2));
        System.out.println("2 == 3 : " + (2==3));
        System.out.println("2 != 3 : " + (2!=3));
        System.out.println("2 != 2 : " + (2!=2));
        System.out.println("!(2 != 2) : " + !(2!=2));// !뒤에 올수있는 데이터의 타입은 boolean
    }
}
