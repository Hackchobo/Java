package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = scan.nextLine();
        System.out.print("나이 입력: ");
        String input = scan.nextLine();
        int age = Integer.parseInt (input);

       // System.out.println("나의 이름은 :"+ name);
        System.out.printf("나의 이름은 %s 이고 나이는 %d살 입니다.%n", name, age);



    }
}
