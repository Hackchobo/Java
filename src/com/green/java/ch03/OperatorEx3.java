package com.green.java.ch03;

public class OperatorEx3 {
    public static void main(String[] args) {
      int i=5, z=5;
        System.out.println(i++);            //i는 먼저 5를 나타내준다
        System.out.println(++z);            //z는 ++연산을통해 6이 나타난다
        System.out.printf("i=%d, j=%d\n",i,z);

        int k= 5;
        int r = k++ - ++k;                  //실행방법을 알아보기위한 예제
        System.out.println(r); //-2

    }

}
