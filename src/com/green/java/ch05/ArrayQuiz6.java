package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    copyArr에 numArr을 deep copy 해주세요.
    copyArr값을 모두 출력해 주세요.
    copuArr[0] > 11
    copyArr[1] > 14
    ...
    copyArr[5] > 35
 */
public class ArrayQuiz6 {
    public static void main(String[] args){
        int[] numArr = {11,14,2,7,36,35};
        int[] copyArr = new int[numArr.length];
        numArr[0] = 123;

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n",i,numArr[i]);
        }
    }
}


//deep copy 검증방법
//복사하고
// numArr[0] = 33;
//copyArr의 모든 값을 출력해본다.