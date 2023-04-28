package com.green.java.ch08;

public class TryCatchStudy1 {
    public static void main(String[] args) {
    //    int r1 = 10/0; 수학적오류가 난다.  그래서
        try{
            int r1 = 10/0; // 여기에 써주면 에러 제외
            System.out.println("다음줄");
            //예외가 발생될 가능성이 있는 로직(source) 위치
        } catch (Exception e) {

            e.printStackTrace(); // 에러가 발생한것을 보고 싶으면 printStackTrace() 사용하면 됨
            System.out.println("예외발생");
            //예외가 발생되었을 때 하고 싶은 작업(로직) 위치
        } finally {
            System.out.println("파이널리");
            //옵션, 예외가 발생이 되든 안되든 무조건 실행하고 싶은 로직 위치
        }

        System.out.println("끝!");
    }
}
