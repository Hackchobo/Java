package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) >");
        String temp = scan.nextLine();
        int sum = sumSteingNumber(temp);
        System.out.printf("각 자리수의 합 : %d\n", sum);
        /*int num = 0, sum =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) > ");
        String temp = scan.nextLine();
        int val = Integer.parseInt(temp);

       while(val>0){
           int oneVal = val %10;
            sum += oneVal;
            val = (int)val /10;
       }
        System.out.println("각자리수의 합 :" +sum);*/
    }

    public static int sumSteingNumber(String temp) {
        int val = Integer.parseInt(temp), sum = 0;
        while (val > 0) {
            sum += val % 10;
            val /= 10;
        }return sum;
        /*int val = Integer.parseInt(temp), sum=0;
        while(val>0){
            int oneVal = val %10;
            sum += oneVal;
            val = val /10;
        } return sum;*/
    }

}
