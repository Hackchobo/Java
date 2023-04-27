package com.green.java.ch01;

public class DateTest2 {
    public static void main(String[] args) {
        int y = 2023, m = 8, d = 27;
        String sMon = String.valueOf(m);
        if (m < 10){
            sMon = "0" + sMon;
        }
        String sDay = String.valueOf(d);
        if (d<10){
            sDay = "0" + sDay;
        }
        System.out.printf("%s-%s-%s",y,sMon,sDay);


        //"2023-12-27"
    }

}
