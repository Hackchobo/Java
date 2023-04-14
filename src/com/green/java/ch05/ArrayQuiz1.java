package com.green.java.ch05;
// for (값 입력, 1,2,3)
// for (값 출력, 각 방에 있는 값을 출력)
// 00.lrngth 사용시 문자열의 길이를 출력해준다.
public class ArrayQuiz1 {
    public static void main(String[] args) {
        /*int[] numArr = {0,0,0};
        for (int i = 0; i < 3; i++) {
            numArr[i] =i+1 ;
        }
        for (int i = 0; i < 3; i++){
            System.out.println(i+ ">" + numArr[i]);
        }*/
        int[] numArr = {0,0,0};
        for (int i = 0; numArr.length < 3; i++) {
            numArr[i] =i+1 ;
        }
        for (int i = 0; i < numArr.length; i++){
            System.out.println(i+ ">" + numArr[i]);
        }
    }
}
