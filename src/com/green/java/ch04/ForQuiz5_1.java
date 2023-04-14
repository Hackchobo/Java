package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("몇단 하쉴? : ");
        int gugudan= scan.nextInt();

        for (int i = 1; i <= 9; i++) {
            for(int j= 2; j<10; j++) {
                System.out.print(j +"x"+ i +"="+i*j);
                System.out.print("\t");
            }
            System.out.println();
          //  System.out.printf("%d * %d = %d \n", gugudan, i, gugudan * i);
          //  System.out.println(gugudan +"x"+i +"="+gugudan*i);
        }
    }
}
