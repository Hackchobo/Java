package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 섞어주세요.
 */
public class ArrayQuiz12_1 {
    public static void main(String[] args) {
        int[] numArr= {11,14,2,7,36,35};

        for (int i = 0; i < numArr.length; i++) {
            int suffle =(int) Math.random() * numArr.length;
            int temp = numArr[i];
            numArr[i] = numArr[suffle];
            numArr[suffle]=temp;
        }
        System.out.print(Arrays.toString(numArr));

    }
}
