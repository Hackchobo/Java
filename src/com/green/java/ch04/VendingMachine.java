package com.green.java.ch04;

public class VendingMachine {

    private int money;

    void insert(int money) {

        this.money += money;
    }

    void showMoney() {
        System.out.printf("현재잔액은 %,d 입니다.\n",money);
    }
}
