package com.green.java.ch04;

import java.util.Scanner;
// 90점 보다 크거나 같으면 "%d점의 학점은 A입니다."
// 80점 보다 크거나 같으면 "%d점의 학점은 B입니다."
// 70점 보다 크거나 같으면 "%d점의 학점은 C입니다."
// 70점 미만 opt 없음 무조건 D학점, 나머지 "%d점의 학점은 D입니다."
// 1의 3자리가 8점이상 +,4미만 -, 나머지 0
class ScoreObj2 {
    String getGrade(int score){
        if(score >100 || score<0){
            return "점수는 0~100점 사이 입니다.";
        } else if (score < 70) {
            return String.format("%d점의 학점은 D입니다.", score);
        }

        String grade= "C";
        if (score ==100){
            return "100점의 학점은 A+입니다.";
        }
        if (score >= 90){
            grade += "A";
        } else if (score >=80) {
            grade += "B";
        }
        int num = score %10;
        if (num >= 8 || score ==100){
            grade +="+";
        } else if (num <4) {
            grade +="-";
        } else {
            grade +=" ";
        }
        return String.format("%d점의 학점은 %s 입니다.", score,grade);
    }
}

public class FlowEx5Method {
    public static void main(String[] args) {
        int score = 0;
//        char grade= ' ', opt = '0';

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        ScoreObj2 so = new ScoreObj2();
        String result = so.getGrade(score);
        System.out.print(result);

    }
}
