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

import java.util.Arrays;

public class ArrayEx19 {
    public static void main(String[] args) {
        String[] titles ={ "국어", "영어", "수학"};

        int [] [] score = {
                {100, 90, 80},  //국어
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=========================================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            double avg = 0;
            System.out.printf("%3d\t",i+1);
            for (int j = 0; j < score[i].length; j++) {
                sum +=score[i][j];
                avg = sum/score[i].length;
                System.out.printf("%3d\t",score[i][j]);
            }
            System.out.printf("%d\t",sum);
            System.out.println(avg);

        }
//        System.out.println(sum);


        /*for (int i = 0; i < score.length; i++){
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%d\t",score[i][j]);
            }
            System.out.println();
        }*/
        System.out.println("=========================================");
        System.out.println("총점");
        for (int i = 0; i < titles.length; i++) {
            int sum =0;
            System.out.print(titles[i]);
            for (int j = 0; j <titles.length+1 ; j++) {
                sum += score[j][i];
            }System.out.printf("%d\n",sum);

            /*for (int j = 0; j < i; j++) {
                System.out.println(score[i][j]+score[i][j]+score[i][j]);
            }*/

        }
        /*for (int i = 0; i < score.length; i++) {
            int sum2 =0;
            for (int j = 0; j < score[i].length; j++) {
                sum2 += score[i][j];
            }
            System.out.printf("%d\n",sum2);
        }*/

        /*for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%d\t %d\t %d\t %d\t %d\t %d\n",j+i,score[i][j],score[i][j],score[i][j],sum,avg);
            }
            System.out.println();
        }*/

       /* for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
        }System.out.println("sum = "+sum);
*/

    }
}
