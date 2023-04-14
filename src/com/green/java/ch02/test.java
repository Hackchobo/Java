package com.green.java.ch02;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름을 입력 해주세요: ");
        String name = scan.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        String input = scan.nextLine();
        int age = Integer.parseInt (input);
        System.out.printf("나의 이름은 %s 나이는 %d 입니다.", name,age);

    }
}
