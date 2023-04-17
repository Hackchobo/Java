package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 섞어주세요.
 */
public class ArrayQuiz12_4 {
    public static void main(String[] args) {
        int[] numArr= {11,14,2,7,36,35};

        for (int i = 0; i < numArr.length; i++) {
            int a = (int) (Math.random() * numArr.length);

            int temp = numArr[i];
            numArr[i] = numArr[a];
            numArr[a] = temp;
        }

        System.out.print(Arrays.toString(numArr));

    }
}
