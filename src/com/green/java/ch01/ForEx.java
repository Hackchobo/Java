package com.green.java.ch01;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("별갯수 입력 : ");
        int s = scan.nextInt();
        int star = s;

        for (int i=1;i<=star;i++) {
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
