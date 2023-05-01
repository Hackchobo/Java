package com.green.java.ch05;
//p.207,p.166(향상된 for문 foreach)
public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for (int i=0;i<names.length;i++){
            System.out.printf("names[%d]: %s\n", i, names[i]);

        }
        names[0] = "Yu";
        int i = 0;
        for(String nm : names){ // foreach문은 순서대로 nm에 복사가된다. 장점 : 조건식이나 ++안적어도된다. 값만사용할때는 좋다.값만 읽기 할때는 좋다.
            // 단점 인덱스값을 못쓴다.

            System.out.printf("names[%d]: %s\n",i++, nm);
        }
    }

}
