package com.green.java.ch8;

public class TryCatchStudy2 {
    public static void main(String[] args) {
        String str = "12a3";

        try{
            int r1 = 10/0;
            int num = Integer.parseInt(str); // 넘버포맷 오류의 원인
            System.out.println("num : "+num);
        }catch (ArithmeticException e){
            System.out.println("숫자 예외 발생");
        }catch (NumberFormatException e) {
            System.out.println("넘버포맷 예외 발생");
        }catch (Exception e) { // 왠만하면 제일밑에 적어주면 좋다. finally앞에 써주거나 제일 밑에 있어야 한다.
            e.printStackTrace();
            System.out.println("예외발생");
        } finally {     // 무조건 실행한다.
            System.out.println("파이널리");
        }
        System.out.println("끝!");
    }
}
