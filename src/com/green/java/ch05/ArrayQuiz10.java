package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 이용하여
    배열에서 가장 작은 숫자를 찾아내어 출력해 주세요.
 */
public class ArrayQuiz10 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        int Min = numArr[0];
        int Max = numArr[0];

        for (int i = 0; i < numArr.length; i++) {
            if (Min > numArr[i]) {
                Min = numArr[i];
            } else if (Max < numArr[i]) {
                Max = numArr[i];
            }
        }
        System.out.println("Min : " + Min + ", Max : " + Max);


 /*       for (int i = 0; i < numArr.length; i++) {
            if(Min >numArr[i]){
                Min = numArr[i];
            }
        }System.out.println(Min);*/
    }
}
