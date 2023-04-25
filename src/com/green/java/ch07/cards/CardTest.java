package com.green.java.ch07.cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck(); // 이것만 생성해도 % 를 실행할수 있다.
       // cd.openCards();

        System.out.println("----------------------------");
        cd.suffle();
        cd.openCards();
        System.out.println("----------------------------");


   /*     Card c1 = cd.pick();
        System.out.println(c1.kind + ", " + c1.num);

        Card c2 = cd.pick();
        System.out.println(c2.kind + ", " + c2.num);

        Card c3 = cd.pick();
        System.out.println(c3.kind + ", " + c3.num);
*/
        for (int i = 0; i < cd.cards.length; i++) {
            cd.pick();
        }

        //cd.pick(); 실행하면 오류가난다.
        cd.openCards();
    }
}
