package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = (int)(Math.random()*100)-1;
        System.out.println(answer);

        do {
            System.out.print("1~100 사이의 점수를 입력 :");
            input = scan.nextInt();

            if(input<answer){
                System.out.print("up\n");
            }else if(input > answer){
                System.out.print("down\n");
            }

        }while (input!=answer);
        System.out.println("good");

        /*while (input!=answer) {
            if(input>answer){
                System.out.print("up\n");
            }else if(input < answer){
                System.out.print("down\n");
            }
            System.out.print("1~100 사이의 정수를 입력 :");
            input = scan.nextInt();
        }
        System.out.println("good");*/
    }
}
