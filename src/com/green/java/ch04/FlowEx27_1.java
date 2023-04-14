package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("합계를 구할 숫자를 입력하세요. (끝내려면 0) :");


            while (flag) {
                System.out.print(">>");
                num= scan.nextInt();
                if(num!=0){
                    sum += num;
                }else {
                    System.out.println("끝");
                    break;
                }
            }
            System.out.println(sum);

 /*       while (flag){
            System.out.print(">>");
            num = scan.nextInt();

            if(num==0){
                flag =false;
            } else{
                sum += num;
            }
        }
        System.out.println(sum);*/
    }
}
