package com.green.java.ch02;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);

        System.out.print("이름이 뭐에요? ");
        String b = a.nextLine();
        System.out.print("전화 번호");
        String c = a.nextLine();
        int d = Integer.parseInt(c);

        System.out.printf("이름과 %s나이%d",b,d);

    }
}
