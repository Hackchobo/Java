package com.green.java.ch05;
/*
    번호 국어 영어 수학 총점 평균
    =========================
    1   100 100 100 300 100.0
    2    20  20  20  60 20.0
    ...
    =========================
    총점
    국어 : 240
    영어 : 230
    수학 : 220
 */

public class ArrayEx19_2 {
    public static void main(String[] args) {
        String[] titles ={ "국어", "영어", "수학", "사회"};

        int sum2 = 0;
        int sum = 0;
        double avg = 0;
        int [] [] score = {
                {100, 90, 80, 50},  //국어
                {20, 20, 20, 50},
                {30, 30, 30, 50},
                {40, 40, 40, 50}

        };
        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=========================================");

        for (int i = 0; i < score.length; i++) {
            sum = 0;
            System.out.printf("%d \t", i+1);
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%d\t",score[i][j]);
                sum += score[i][j];
                avg = (double)sum /score[i].length;
            }
            System.out.printf("%2d %.2f\n",sum,avg);
        }
        System.out.println("=========================================");
        System.out.println("총합");
        for (int i = 0; i < titles.length; i++) {
            sum2 = 0;
            for (int j = 0; j < score.length; j++) {
                sum2 += score[j][i];
            }System.out.println(sum2);
        }

        
    }
}
