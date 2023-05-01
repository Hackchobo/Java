package com.green.java.ch04;

import java.util.LinkedList;

public class VendingMachine {

    private int money; // 전역변수이며 멤버필드는 객체가살아있는 동안 살아있다.
    private String[] menuNames = {"콜라", "사이다", "환타", "미란다"};
    private int[] menuPriceArr = {1000, 1500, 2000, 2500};
    private LinkedList<Integer> purchaseList = new LinkedList<>();
    private String[] inlkjsdfsf;

    void insert(int money) {

        this.money += money;
    }

    void showMoney() {
        System.out.printf("현재잔액은 %,d원 입니다.\n",this.money);
    }

    void showMenus() {
        System.out.println("번호\t메뉴명\t가격\t");
        for (int i = 0; i < menuNames.length; i++) {
            System.out.printf("%d\t %s\t %,d원\n",i+1,menuNames[i],menuPriceArr[i]);
        }
        /*switch (menu){
            case 1:
                money -=menuPriceArr[menu-1];
                break;
            case 2:
                money -=menuPriceArr[menu-1];
                break;
            case 3:
                money -=menuPriceArr[menu-1];
                break;
            case 4:
                money -=menuPriceArr[menu-1];
                break;
        }
        System.out.printf("%d\t %s\t %,d\n",menu,menuNames[menu-1],money);*/
    }

    void purchaseDrink(int num){
        int idx = num -1;
        money -=menuPriceArr[idx];
        System.out.printf("%s를 구매하였습니다. (money값은 %,d)\n",menuNames[idx],money);
        purchaseList.add(idx);
    }


    void showPurchaseList(){
        if(purchaseList.size() == 0){
            System.out.println("제품을 구매하지 않았습니다.");
        }
        if(purchaseList.size()>0){
            int idx = purchaseList.get(0);
            System.out.print(menuNames[idx]);

            for (int i = 1; i < purchaseList.size(); i++) {
                idx = purchaseList.get(i);
                System.out.printf(", %s", menuNames[idx]);
            }
            System.out.println(" 을(를) 구매하였습니다.");
        }
//        System.out.printf("%s 을(를) 구매하였습니다.\n",menuNames[purchaseList].toString());
    }
}
