package com.green.java.ch01;

import java.util.Scanner;

public class _IfEx1 {
    public static void main(String[] args) {
//        for (int i=0;i<5;i++){
//            for (int j=0;j<5;j++){
//                System.out.print(" ");
//            }
//            for (int j=0;j<10;j+=2){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        Scanner scan = new Scanner(System.in);
        System.out.print("별만들갯수 : ");
        int a = 5;
        for (int i = 0; i < a; i++) {          //위에단
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = a; i > 0; i--) {          //밑에단
//            for (int j = 0; j < a - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2 - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*int a = 8;
        for (int i=a; i>0; i--){
            if(a==0) {
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }*/
        /*int star=10;
        for (int i =star/2; i>0; i--){
            for(int z=0; z<=star-i;z++){
                if(z < i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i =0-1; i<star/2; i++){
            for(int z=1; z<=star-i;z++){
                if(z <= i+1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
        /*int a = 8;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a; i > 0; i--) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int star = 9;
        for (int i = star / 2; i > 0; i--) {
            for (int z = 0; z <= star - i; z++) {
                if (z < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0 ; i < star / 2; i++) {
            for (int z = 1; z <= star - i; z++) {
                if (z <= i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
    }
}