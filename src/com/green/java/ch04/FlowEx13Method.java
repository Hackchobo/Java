package com.green.java.ch04;

public class FlowEx13Method {
    public static void main(String[] args) {
        // 최소값~최대값 사이의 값을 전부 더하고 출력
        //min값 ~ max값 sum: 값
        printAllSum(1,100);
        // 1 ~ 100 sum = 5050

        printAllSum(2,3);
        // 2~3 sum =5
    }

    public static void printAllSum(int min, int max){ // static을 붙이면 바로 호출이 가능하다. 같은클래스안에서 호출가능해진다.

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum +=i;
        }
        System.out.printf("min: %d, max: %d sum : %d\n",min, max, sum);
        //집ㅇ-ㅔ Gr고싶Dr... ㄴr du.....

    }
}
