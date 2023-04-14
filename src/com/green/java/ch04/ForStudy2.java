package com.green.java.ch04;

public class ForStudy2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("\n________________");
        for(int i=1; i<6; i++){
            if(i == 5){
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n________________");
        for(int i=1; i<6; i++){
            if (i>1){
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}
