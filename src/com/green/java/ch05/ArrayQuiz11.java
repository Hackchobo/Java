package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    배열에 들어있는 값 평균값을 구해주세요.

    avg :
 */
public class ArrayQuiz11 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        int sum = 0;
        double avg = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        avg = (double) sum / numArr.length;
        System.out.printf("Avg : %.2f", avg);


 /*       for (int i = 0; i < numArr.length; i++) {
            if(Min >numArr[i]){
                Min = numArr[i];
            }
        }System.out.println(Min);*/
    }
}
