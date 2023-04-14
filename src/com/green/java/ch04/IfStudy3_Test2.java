package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3_Test2 {
    public static void main(String[] args) {
        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.print("성별 입력 (w,m) :");
        String gender = scan.nextLine();

        System.out.print("키입력 (cm): ");
        int height = scan.nextInt();

        int stand = 0;

        if (gender.equals("w")) {
            stand = WOMAN_HEIGHT_STAND;
        } else if(gender.equals("m")){
            stand = MAN_HEIGHT_STAND;
        } else {
            System.out.println("잘못 입력하셧어요");
        }

        if (height> stand){
            System.out.println("평균 초과");
        } else if (height < stand) {
            System.out.println("평균 이하");
        } else {
            System.out.println("평균");
        }

    }
}
