package com.green.java.ch01;

public class RandomEx {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {(int) (Math.random()*3)};
        System.out.println(a[0]);
        System.out.printf("%d",b[0]);
    }
}
