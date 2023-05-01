package com.green.java.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValuArr(lottoArr);
        setRandomValuArr2(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
    }

    public static int getRandomValueFromTo(int sVal, int eVal) {
        return (int)(Math.random() * (eVal - sVal +1))+ sVal;
    }

    public static void setRandomValuArr2(int[] lottoArr) {
        Loop:
        for (int i=0;i< lottoArr.length;){
            int rVal = getRandomValueFromTo(1,45);
            for (int z = 0; z < i; z++) {
                if (lottoArr[z] == rVal){
                    continue Loop;
                }
            }
            lottoArr[i++] = rVal;
        }
    }

    static void setRandomValuArr(int[] lottoArr) {
        for (int i = 0; i < lottoArr.length; i++) {
            int rVal = getRandomValueFromTo(1, 6);
            for (int z = 0; z < lottoArr.length; z++) {
                if (lottoArr[z] == 0) {
                    lottoArr[z] = rVal;
                    break;
                } else if (lottoArr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }

    /*static void sortArr(int[] selec){   // 선택정렬
        for (int i = 0; i < selec.length-1; i++) {
            for (int z = i+1; z < selec.length; z++) {
                if(selec[i]>selec[z]){
                    int tmp = selec[i];
                    selec[i] = selec[z];
                    selec[z] = tmp;
                }
            }
        }
    }*/

    public static void sortArr(int[] lottoArr){
        for (int i = lottoArr.length-1; i>0; i--) {
            for (int z = 0; z < i; z++) {
                if (lottoArr[z] > lottoArr[z+1]){
                    int temp = lottoArr[z];
                    lottoArr[z] = lottoArr[z+1];
                    lottoArr[z+1] = temp;
                }
            }
        }
    }

    /*static void sortArr(int[] buble){ // 버블정렬
        for (int i = 0; i < buble.length-1; i++) {
            for (int z = 0; z < buble.length-i-1; z++) {
                if(buble[z] > buble[i]){
                    int tmp = buble[z];
                    buble[z] = buble[z+1];
                    buble[z+1] = tmp;
                }
            }
        }
    }*/

    /*static void setRandomValuArr(int[] lot) {
        for (int i = 0; i < lot.length; i++) {
            lot[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lot[i] == lot[j]) {
                    j--;
                }
            }
        }
        for(int i=0;i<lot.length-1;i++) {
            for(int j=0;j<lot.length-1-i;j++){
                if(lot[j]>lot[j+1]) {
                    int tmp=lot[j];
                    lot[j]=lot[j+1];
                    lot[j+1]=tmp;
                }
            }
        }
    }*/
}
