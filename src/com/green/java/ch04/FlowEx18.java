package com.green.java.ch04;

public class FlowEx18 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf(j + "x" + i + "=" + i * j);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
