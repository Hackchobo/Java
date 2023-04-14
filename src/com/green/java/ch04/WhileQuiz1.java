package com.green.java.ch04;

import java.util.Scanner;

//while문으로 해결
//램덤값 1~100 사이의 정수를 입력
//1~100 사이의 정수를 입력 :50
//down
//1~100 사이의 정수를 입력 :25
//up
//1~100 사이의 정수를 입력 :30
//good!
public class WhileQuiz1 {
    public static void main(String[] args) {
        int input, answer ;
        answer = (int)(Math.random()*100);
        Scanner scan= new Scanner(System.in);
        System.out.println(answer);
        System.out.print("1~100 사이의 정수를 입력 :");
        input = scan.nextInt();
        // 1~10
/*        System.out.println(answer);

        */
        while (input!=answer) {
            if(input>answer){
                System.out.print("up\n");
            }else if(input < answer){
                System.out.print("down\n");
            }
            System.out.print("1~100 사이의 정수를 입력 :");
            input = scan.nextInt();
        }
        System.out.println("good");
    }
}
