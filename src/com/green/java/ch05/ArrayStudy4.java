package com.green.java.ch05;

public class ArrayStudy4 {
    public static void main(String[] args){

        int[] numArr = new int[] {10, 20 ,30 ,40 ,50};
        int[] copyArr = numArr; // shalow 카피 가벼운 카피

        numArr[0] = 123;
        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] = %d \n", i, copyArr[i]);
        }
        int[] arr = {1,2,3};
        printArr(arr);

        printArr(new int[] {1,2,3});
    }

    public static void printArr(int[] arr){

    }
}
