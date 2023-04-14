package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요 : ");

        Scanner scan= new Scanner(System.in);
        int mon = scan.nextInt();

        switch (mon) {

            case 3: case 4: case 5:
                System.out.println("현재는 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재는 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재는 가을입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("현재는 겨울입니다.");
                break;
            default:
                System.out.println("잘못함");
        }
    }
}
