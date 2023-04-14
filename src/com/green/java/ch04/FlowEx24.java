package com.green.java.ch04;

public class FlowEx24 {
    public static void main(String[] args) {
        int i= 11;
        System.out.println("카운트다운");

        while (i-- !=0){
            System.out.println(i);

            for(long z=0;z<2_099_999_999; z++){
                int y=0;
            }
        }
        System.out.println("끝");
    }
}
