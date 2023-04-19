package com.green.java.Test;

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
public class Array_cal {
    public static void main(String[] args) {
        int sum=0;
        double avg = 0;
        int[][] score = {
                {100, 90, 80},  //국어
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };

        System.out.println("번호\t 국어\t 수학\t 영어\t 합계\t 평균");
        System.out.println("=============================");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d \t", i + 1);
            sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%3d\t\t", score[i][j]);
                sum += score[i][j];
                avg=(double)sum/score[i].length;
            }
            System.out.printf("%d\t %.2f \n",sum,avg);
        }

    }
}

