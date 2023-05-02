package com.green.java.ch06;

public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str);

        ValueBox vb = new ValueBox();
        vb.num = 10;
        System.out.println(vb.toString());

    }
}

class ValueBox {
    int num;
@Override
    public String toString() {  // 오버라이딩을 하면 원래의 채널값이 나온다.
        return "num : " + num;
    } // return String.valueOf(num);
}
