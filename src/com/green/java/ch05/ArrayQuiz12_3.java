package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 섞어주세요.
 */
public class ArrayQuiz12_3 {
    public static void main(String[] args) {
        int[] numArr= {11,14,2,7,36,35};

        for (int i = 0; i < numArr.length; i++) {

            int a = (int)(Math.random()* numArr.length);

            int temp = numArr[a];
            numArr[a] = numArr[i];
            numArr[i] = temp;
        }

        System.out.print(Arrays.toString(numArr));

    }
}
