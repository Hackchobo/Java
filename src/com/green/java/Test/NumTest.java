package com.green.java.test;

public class NumTest {
    public static void main(String[] args) {
        int num = 10; // 메소드안에서 선언하는 변수는 무조건 지역변수이다 -> 리턴키워드를 만나면 지역변수는 죽는다.
        changeNum(num);
        System.out.println("num : "+num);

        Numbox nb = new Numbox();
        changeNum(nb);
        System.out.println("num.getNum() : "+ nb.getNum());
    }

    private static void changeNum(int num) {
        num = 30;
    }

    private static void changeNum(Numbox box) {
        box.setNum(30);
    }
}

class Numbox{

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
