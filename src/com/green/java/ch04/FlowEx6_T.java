package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx6_T {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요 : ");

        Scanner scan= new Scanner(System.in);
        int mon = scan.nextInt();
        String season = "";

        switch (mon) {

            case 3: case 4: case 5:
                season = "봄";
                break;
            case 6: case 7: case 8:
                season = "여름";
                break;
            case 9: case 10: case 11:
                season = "가을";
                break;
            case 12: case 1: case 2:
                season = "겨울";
                break;
            default:
                System.out.println("잘못함");
        }
        if (!"".equals(season)) {           // 문자열 비교할때는 무조건.equals 이며 빈칸 값비교는 빈칸이 앞쪽에 올것.
            System.out.printf("현재의 계절은 %s입니다.", season);
        }
    }
}
