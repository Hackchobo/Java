package com.green.java.ch06;

//p. 265 ~ 267
public class ParamsTest {
    public static void main(String[] args) {
        int num = 10;
        changNum(num);
        System.out.println(num);  // 10
        NumberBox nb = new NumberBox();
        nb.num = 10;
        changeNum2(nb);
        System.out.println(nb.num); //20

        NumberBox nb2 = new NumberBox(); // 너 주소값 11해 11의주소값을 가진 nb2.num = 0;
        changNum3(nb2); // 여기까지는 11이라고 해요 그리고 메소드changNum3 작업을 한다.
        System.out.println(nb2.num); //0 or 30 // 너주소값 11에 nb2.num의 값은 뭐야?
    }

    static void changNum(int num) {
        num = 20;
    }


    static void changeNum2(NumberBox nb2) {
        nb2.num = 20;
    }

    static void changNum3(NumberBox nb2) {
        nb2 = new NumberBox();  // 넌 11이였지만 이젠 너  주소값 13이다.
        nb2.num = 30; // 13에는 30을 넣어줄게  13의주소값을 가진 nb2.num = 30;

    }
}
class NumberBox{
    int num;
}
