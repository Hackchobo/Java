package com.green.java.ch02;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나이가 무엇인고 : ");
        String a = scan.nextLine();
        System.out.print("이름이 뭐에요 : ");
        String b = scan.nextLine();
        int c = Integer.parseInt(a);

        System.out.printf("이름이 %s니까 : 나이가 뭐죠? %d . \n", b,c );

    }
}
