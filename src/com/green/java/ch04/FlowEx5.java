package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade= ' ', opt = '0';

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        // 90점 보다 크거나 같으면 "%d점의 학점은 A입니다."
        // 80점 보다 크거나 같으면 "%d점의 학점은 B입니다."
        // 70점 보다 크거나 같으면 "%d점의 학점은 C입니다."
        // 70점 미만 opt 없음 무조건 D학점, 나머지 "%d점의 학점은 D입니다."

        //1의 3자리가 8점이상 +,4미만 -, 나머지 0
/*        if (score >= 90){
            grade = 'A';
            if (score >97 ){
                opt = '+';
            } else if (score<94) {
                opt = '-';
            }
        } else if (score >=80) {
            grade = 'B';
            if (score >87 ){
                opt = '+';
            } else if (score<84) {
                opt = '-';
            }
        } else if (score >=70) {
            grade = 'C';
            if (score >77 ){
                opt = '+';
            } else if (score<74) {
                opt = '-';
            }
        } else {
            grade = 'D';
        }*/
        if (score >= 90){
            grade = 'A';
        } else if (score >=80) {
            grade = 'B';
        } else if (score >=70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        if (score %10 >= 8){
            opt ='+';
        } else if (score %10 <4) {
            opt ='-';
        } else {
            opt =' ';
        }
        System.out.printf("%d점의 학점은 %c%c입니다.",score,grade,opt);
    }
}
