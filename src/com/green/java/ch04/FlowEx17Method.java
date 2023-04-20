package com.green.java.ch04;

public class FlowEx17Method {
    public static void main(String[] args) {
        int star = 4;

        printStarLine(star); // *****(개행)
        printStarLine(3); // ***(개행)
        System.out.println("--------------");

        printStarRect(star);
        System.out.println("--------------");
        printStarTri(8);
    }

    public static void printStarLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarRect(int star) {
        for (int i = 0; i < star; i++) {
            printStarLine(star);                // 재활용성을 높힌다.
        }
    }
    /*public static void printStarTri(int star) {
        for (int i = 0; i <= star; i++) {
            printStarLine(i);
            *//*for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }*//*
        }System.out.println();
    }*/
    public static void printStarTri(int star) {
        for (int i = star; i > 0; i--) {
            printStarLine(i);
            /*for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }*/
        }System.out.println();
    }
}
