package com.green.java.ch04;

public class BreakContinueStudy {
    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            System.out.print(i+", ");

            if(i ==5){
                System.out.println("\n5에서 끝");
                break; // 그냥 빠져나오는 것(다수사용) 가장가까운 반복문을 빠져나오는 것
            }
        }
        System.out.println("-------------------");
        for (int i=0; i<10;i++){
            if(i==5){
                continue; // 스킵이라고 봐도 된다.(사용을 잘안함) 가장 가까운 반복문을 스킵하고 증감식으로 간다.
            }
            System.out.print(i+", ");
        }
    }
}
