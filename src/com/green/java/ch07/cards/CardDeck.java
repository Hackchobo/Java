package com.green.java.ch07.cards;

import java.util.Arrays;

public class CardDeck {
    Card[] cards;
    int idx ;
    CardDeck() {
        //굳이 idx에 값을주고싶다면 이자리에 하면된다.
        cards = new Card[52];
        /*for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card("", "");
        }*/
        int idx = 0;
        for (int i = 0; i < Card.KINDS.length; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                String num = null;
                switch (z) {
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12:
                        num = "Q";
                        break;
                    case 13:
                        num = "K";
                        break;
                    default:
                        num = String.valueOf(z);
                }

                cards[idx++] = new Card(Card.KINDS[i], num);

            }
        }

    }

    void openCards() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }


    void suffle() {
        for (int i = 1; i < cards.length; i++) {
           int rIdx = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;

        }
    }

    Card pick() {
        // 오류를 방지하려면 (if(idx == cards.length) {return null;} 사용하면된다.
        Card temp = cards[idx];
        cards[idx++] = null;
        return temp; // 지역변수라서 금방 죽어버린다.
    }
}

