package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        //double(8byte), float (4byte)
        float f1 = 101;
        System.out.println(f1);

        f1= (float)9.757;
        f1=9.775f;
        f1=9.77F;
        System.out.println(f1);

        long l1 = 100;
        float f2 = l1; //자동형변환, flout 4byte, long 8byte
        System.out.println(f2);
        System.out.println();

        double d1 = (float)9.77;
        double d2 = 9.77D;
        System.out.println(d1);

    }
}
