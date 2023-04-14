package com.green.java.ch01;

import java.util.Scanner;

public class gugudanscan {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

            System.out.print("구구단 단수: ");
            int input = scan.nextInt();
            int i = input;


            for (int j = 1; j <= 9; ++j) {
                System.out.printf("%d * %d = %d \n", i, j, i * j);


        }
    }
}
