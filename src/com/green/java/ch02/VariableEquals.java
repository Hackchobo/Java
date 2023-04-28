package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);

        boolean r1 = (nb1 == nb2);
        System.out.println("r1 : "+ r1);
        boolean r2 = nb1.equals(nb2);
        System.out.println("r2 : "+r2);
    }
}

class NumberBox extends Object{
    private int num;
    NumberBox(int num) {
        this.num = num;
    }
    int getNum() {
        return num;
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof NumberBox)){return false;}
        NumberBox nb = (NumberBox)obj;
         // 메소드호출은 타입을 알고있는것만 호출가능
        return this.num == nb.getNum();
    }
   /* @Override
    public boolean equals(Object obj) {
    if (!(obj instanceof NumberBox)){return false;}
        if (obj instanceof NumberBox) {
            NumberBox result = (NumberBox) obj;
            if(num==(result.num)) {
                return true;
            }
        }
        return false;

    }*/
}
