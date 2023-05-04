package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private List<Card> cardList;

    public User(){
        cardList = new ArrayList();
    }
    public void receiveCard(Card c) {
        cardList.add(c);
    }

    public List<Card> openCards() {
        return cardList;
    }

    protected int getPointSum(){
        return Rule.getScore(cardList);
    }

    private int getDenominationToNum(Card c){
        switch (c.getDenomination()){
            case "A" :return 1;
            case "J" :
            case "Q" :
            case "K" :
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }
    public void showCards() {
        System.out.println("현재 카드 목록");
        for (Card c : cardList) {
            System.out.println(c);
        }
    }
}
