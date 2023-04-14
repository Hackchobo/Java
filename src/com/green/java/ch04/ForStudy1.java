package com.green.java.ch04;

public class ForStudy1 {
    public static void main(String[] args) {
        // for(0;0;0) for에 항을 할당 안하면 무한루프가된다. 첫번째 칸은 초기화 두번째는 범위지정 세번째는 증감식
//        for(int i=21;i>=18;i--){  // i의 값이 5보다 작을때 까지 루프를 돈다
//            System.out.println("A");
//        }

        for (int i=5; i<=9; i++){ //
            System.out.print((i-4) + " ");
            System.out.print(", ");
        }
    }
}
