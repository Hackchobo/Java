package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullFileNm = "newjeans.jpg";
        String fileNm, ext;

        int idx = fullFileNm.indexOf(".");

        fileNm = fullFileNm.substring(0,idx);
        System.out.println(fileNm);

        ext = fullFileNm.substring(idx+1);
        System.out.println(ext);
    }
}
