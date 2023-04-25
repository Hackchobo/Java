package com.green.java.ch07.cards;

public class Card {
    static final String[] KINDS = { "CLOVER", "HEART", "DIAMOND", "SPADE" }; //무늬들
    static final int NUM_MAX = 13; //무늬별 카드 수

    String kind; //무늬
    String num; //번호

    //외부에서 무늬, 번호 값을 받아서 나의 멤버필드 무늬와 번호에 대입하는 생성자 만들어 주세요.


     // public Card(){} 컴파일러가 생성자가 없으면 임의로 이런식으로 만들어 준다.
    Card(String kind, String num) {
        // 아무것도 안적으면 super(); 를 적어준다 -  super();은 부모생성자의 기본생성자를 호출하는것 맨위에 적어 줘야 된다.
        this.kind = kind;
        this.num = num;
    }

    @Override
    public  String toString(){
        return "king: " + kind + ", num: " + num;
    }
}

