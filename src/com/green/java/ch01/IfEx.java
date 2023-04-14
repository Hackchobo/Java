package com.green.java.ch01;

import java.util.Scanner;

public class IfEx {
    public static void main(String[] args) {


        while (true){
            Scanner scan= new Scanner(System.in);
            System.out.print("너의 점수는 : ");
            int a = Integer.parseInt(scan.nextLine());

            if (a<0 || a>100) {
                break;
            }
            else if (a>80){
                System.out.println("축하해요");
            }
            else {
                System.out.println("안축하해요");
            }
            return;

        }
    }
}
