package com.green.java.ch05;

/*
    numArr 배열을 섞어주세요.
 */
public class ArrayQuiz12 {
    public static void main(String[] args) {
        int[] numArr= {11,14,2,7,36,35};

        for (int i = 0; i < numArr.length; i++) {
            double sw =Math.random()* numArr.length;
            int ran = (int) sw;
            int tmp = numArr[ran];
            numArr[ran] = numArr[i];
            numArr[i] = tmp;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d ", numArr[i]);
        }

    }
}
