package com.green.java.blackjack;

public class Dealer extends User{
    private final int CAN_RECEVE_POINT = 16;


    public boolean isReceiveCard() {
       return getPointSum() <= CAN_RECEVE_POINT;
    }
}
