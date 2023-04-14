package com.green.java.ch01;

import java.util.Scanner;

public class ForEx01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("안녕하쇼 몇번할래요? ");
        int t=0;
        int a= scan.nextInt();
        do {
            System.out.println("안녕하쇼");
            t++;
        } while (t<=a);
    }
}
