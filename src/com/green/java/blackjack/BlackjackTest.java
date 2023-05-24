package com.green.java.blackjack;

import java.util.List;
import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }

        if(dealer.isReceiveCard()){
            dealer.receiveCard(cd.getCard());  // 트루일때
        }

        gamer.showCards();
        dealer.showCards();

        Scanner scan = new Scanner(System.in);
            while (true){
                System.out.println("Card More? (y/n) >");              // -- 한번더할지 물어보는 구문
                String answer= scan.nextLine();
                if("n".equals(answer.trim().toLowerCase())){break;}     // -- "n"이 나올경우 브레이크가 되는 구문
                gamer.receiveCard(cd.getCard());
                gamer.showCards();
            }

        System.out.println("---- 딜러 카드 ----");
            dealer.showCards();

            Rule.whoIsWin(gamer, dealer);
    }
}
