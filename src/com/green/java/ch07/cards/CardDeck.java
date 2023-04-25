package com.green.java.ch07.cards;

import java.util.Arrays;

public class CardDeck {
    Card[] cards;
    int idx ;
    CardDeck() {  // <-- %
        //굳이 idx에 값을주고싶다면 이자리에 하면된다.
        cards = new Card[52];
        /*for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card("", "");
        }*/
        int idx = 0;
        for (int i = 0; i < Card.KINDS.length; i++) { // 카드 클래스안에 잇고 메소드는 아니다. 상수이며 Static이다. .을 사용할수있는건 객체만 된다.
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
                        num = String.valueOf(z); // 문자열로 변경 시켜주는 메소드이다.
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
           if(i == rIdx) { continue;} // 상황마다 다르지만 범위값이 크면 빼줘도 되는 부분이다.
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;

        }
    }

    Card pick() {
        // 오류를 방지하려면 (if(idx == cards.length) {return null;} 사용하면된다. ->있는 이유는 idx의 값이 넘어가버리기 시작하면 오류가 나기 시작하기 때문에 예외처리를 하기 위해서 사용한다.
        Card temp = cards[idx];
        cards[idx++] = null;
        return temp; // 지역변수라서 금방 죽어버린다.
    }
}

