package com.green.java.ch8;

public class TryCatchStudy5 {
    public static void main(String[] args) {

        try {
            getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

            otherGetConnection2();
    }
//throws Exception은 에러가 발생하면 에러를 던진다.
    public static void getConnection() throws Exception {
        System.out.println("DB 연결!!");
    }

    public static void otherGetConnection() throws Exception{
        getConnection();
    }

    public static void otherGetConnection2() {
        try {
            getConnection();
        } catch (Exception e){

        }
    }
}
// 2번페이지와 5번페이지만 알고있으면 된다.