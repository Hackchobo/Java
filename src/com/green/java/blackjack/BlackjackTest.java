package com.green.java.blackjack;

import java.util.List;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();


        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

        /*List<Card> cardList = gamer.openCards();
        int score = rule.getScore(cardList);*/

        //int score = rule.getScore(gamer.openCards());

        int gamerScore = rule.getScore(gamer.openCards());
        int dealerScore = rule.getScore(dealer.openCards());
        System.out.println(gamerScore);
        System.out.println(dealerScore);



    }
}
