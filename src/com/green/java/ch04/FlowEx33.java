package com.green.java.ch04;

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1:                                  //for에 임의의 이름을 부여해주는것
        for (int i=2; i<=9; i++){
            for (int j = 0; j < 9; j++) {
                if (j == 5) {
                    break Loop1;                //Loop1를 break/continue 한다.werwrewr
                }
                System.out.printf("%d, %d\n",i,j);
            }
        }
    }
}
