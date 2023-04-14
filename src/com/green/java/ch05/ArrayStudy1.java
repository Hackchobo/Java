package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간
        int n1=1, n2=2,n3=3;
        int[] numArr = {10,20,30}; // int[] 형 배열이다. 여러가지 수를 저장할수있는 것 0 ~ 시작 for로 이용 많이함
        int numArr2[]= {10,20};  // 차이는 없으나 c에서많이 사용하므로 자바에서는 안씀

 /*       numArr[0] =11;
        int num = numArr[0];
        System.out.println("num : " + num);*/
        for (int i = 0; i < 3; i++) {
            System.out.println(numArr[i]);
        }

    }
}
