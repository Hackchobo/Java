package com.green.java.ch04;

import java.util.Scanner;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        // 'vm' = 밴딩머신 객체의 주소값을 받을수있다.
        // 주소값이 없을때만 null이다.
        VendingMachine vm2 = new VendingMachine();
        Scanner scan= new Scanner(System.in);
        /*System.out.print("무엇을 뽑을래요? ");
        int menu = scan.nextInt();*/


        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);

        vm.showMenus();
        vm.purchaseDrink(2); //콜라를 구매하였습니다. (money값은 -1000처리)
        vm.purchaseDrink(1); //콜라를 구매하였습니다. (money값은 -1000처리)
        vm.purchaseDrink(1); //콜라를 구매하였습니다. (money값은 -1000처리)
        vm.showMoney();

        vm.showPurchaseList();
        /*
        번호 \t 메뉴명 \t 가격
        1. \t 콜라 \t 1,000원
        2. \t 사이다 \t 1,500원
        3. \t 환타 \t 2,000원
        4. \t 미란다 \t 2,500원
         */

        //vm.showMoney(); // 현재 잔액은 40,000원 입니다.
       // vm2.showMoney();
    }

}
