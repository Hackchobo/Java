package com.green.java.ch8;

public class TryCatchStudy4 {
    public static void main(String[] args) {
//      throw는 무조건 예외를 발생시키는 것이다.
        int type = 1;
        try{
//            Exception e = new Exception("고의로 예외 발생");
            System.out.println("ddd");

            if(type == 0){
//                Exception e = new Exception("고의로 예외 발생");
                throw new Exception("고의로 예외 발생");
            } else if (type ==1) {
                throw new ArithmeticException("dd");
            }
        }catch (ArithmeticException e) {
            System.out.println("arithmetic 에러메시지 : " + e.getMessage());
        }catch (Exception e){
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("끝!");
    }
}
