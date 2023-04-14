package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5_1 {
    public static void main(String[] args) {
        int score = 0;
        char grade= ' ', opt = '0';

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        // 90점 보다 크거나 같으면 "%d점의 학점은 A입니다."
        // 80점 보다 크거나 같으면 "%d점의 학점은 B입니다."
        // 70점 보다 크거나 같으면 "%d점의 학점은 C입니다."
        // 나머지 "%d점의 학점은 D입니다."

        if(score>=90) {
            grade = 'A';
        } else if (score >=80) {
            grade = 'B';
        } else if (score >=70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        if(score %10 >= 8 ||score ==100){
            opt = '+';
        } else if (score %10 <= 4) {
            opt = '-';
        } else {
            opt = ' ';
        }

        System.out.printf("%d점의 학점은 %c%c입니다.",score,grade,opt);
    }
}
