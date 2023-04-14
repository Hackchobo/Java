package com.green.java.ch03;

import java.util.Scanner;


public class OperatorStudy8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("숫자를 입력:");
        int num = scan.nextInt();
        System.out.println("num : "+num);

//        String a = "짝수";
//        String b = "홀수";
//        String c ;
//
//        c= num %2 ==0 ? a:b;
//        System.out.println(c);
        String result = num %2 ==0 ? "짝수" : "홀수";
        System.out.println("숫자"+num+"는"+result+"이다.");
    }
}
