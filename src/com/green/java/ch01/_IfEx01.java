package com.green.java.ch01;

import java.util.Scanner;

public class _IfEx01 {
    public static void main(String[] args) {
        /*for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*Scanner scan=new Scanner(System.in);
        System.out.print("별갯수 입력 : ");
        int star = scan.nextInt();
            for (int i=0;i<star;i++) {
                    for (int j = i; j < star; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i*2-1; j++) {
                        System.out.print("*");
                    }
                System.out.println();
                }
            for (int i=star;i>0;i--) {
                for (int j = i; j < star; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i*2-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }*/
        /*int star = 9;
        for (int i = star / 2; i > 0; i--) {
            for (int z = 0; z <= star - i; z++) {
                if (z < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
        /*for(int i=10;i > 0; i--){
            for (int j=0;j<10-i;j++){
                if (j < i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }System.out.println();
        }*/
        for (int i=10;i>0;i--){
            for (int j=0;j<10-i;j++){
                if(j < i){
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

