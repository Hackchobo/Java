package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 이용하여
    Arrays.toString 메소드 이용하지않고
    아래처럼 출력되도록 로직으로 해결하세요
    [11, 14, 2, 7, 36, 35]
 */
public class ArrayQuiz8 {
    public static void main(String[] args) {
        int[] numArr = {11,14,2,7,36,35};
//        System.out.println(Arrays.toString(numArr));
        /*System.out.print("[");
        for (int i = 0; i < numArr.length; i++) {
            if (i< numArr.length-1){
                System.out.printf("%d, ",numArr[i]);
            } else {
                System.out.printf("%d",numArr[i]);

            }
        }
        System.out.println("]");*/

        System.out.printf("[%d", numArr[0]);
        for (int i = 1; i < numArr.length; i++) {
            System.out.printf(", %d",numArr[i]);
        }
        System.out.println("]");
    }
}
