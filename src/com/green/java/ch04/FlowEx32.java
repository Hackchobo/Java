package com.green.java.ch04;

/*
 (1)squre
 (2)squre root
 (3)log
 원하는 메뉴(1~3)를 선택하세요 (종료.0) > 4
 메뉴를 잘못 선택하셨습니다.(종료: 0)
 (1)squre
 (2)squre root
 (3)log
 원하는 메뉴(1~3)를 선택하세요 (종료.0) > 1
 메뉴를 잘못 선택하셨습니다.(종료: 0)
 (1)squre
 (2)squre root
 (3)log
 원하는 메뉴(1~3)를 선택하세요 (종료.0) > 0
 메뉴를 잘못 선택하셨습니다.(종료: 0)
 프로그램을 종료합니다.

 */

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 메뉴(1~3)를 선택하세요 (종료.0) >");

        /*do {
            System.out.println("(1)squre");
            System.out.println("(2)squre root");
            System.out.println("(3)log");
            a = scan.nextInt();

            if(a ==0){ break;}

            if(a>3 || a<0){
                System.out.println("메뉴를 잘못선택하셨습니다.");
            } else if (a>0 || a<4) {
                System.out.println("선택하신 메뉴는" + a);
            }

        }while (a !=0);
        System.out.println("프로그램을 종료합니다.");*/

        while (true) {

            a = scan.nextInt();
            if(a==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
                System.out.println("(1)squre");
                System.out.println("(2)squre root");
                System.out.println("(3)log");
            if(a>3 || a<0){
                System.out.println("메뉴를 잘못선택하셨습니다.");
            } else if (a>0 && a<4) {
                System.out.println("선택하신 메뉴는" + a);
            }else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }System.out.print("원하는 메뉴(1~3)를 선택하세요 (종료.0) >");
 /*           if(a==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }*/

        }
        /*if (a==1){
                System.out.println("squre");
                System.out.println("선택하신 메뉴는"+ a);
            }
            if(a==2){
                System.out.println("squre root");
                System.out.println("선택하신 메뉴는"+ a);
            }
            if(a==3){
                System.out.println("log");
                System.out.println("선택하신 메뉴는"+ a);
            }
            if(a>3){
                System.out.println("메뉴를 잘못선택하셨습니다.");
                System.out.println("선택하신 메뉴는"+ a);
            }*/

    }
}
