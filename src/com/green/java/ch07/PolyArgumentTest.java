package com.green.java.ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();
        buyer.buy(tv); // Tv를 100만원에 구매 하였습니다.
        buyer.buy(com); // Computer는 200만원에 구매 하였습니다.

        buyer.printState(); // 나의 남은 돈은 얼마입니다. 포인트는 %,d 점입니다.
    }
}
class Buyer {
    private int money;
    public int bonusPoint;

    Buyer(){
        this.money = 1000;
        this.bonusPoint = 0;
        printState();
    }

    public void buy(Product p){
//        int productPrice = p.getPrice();
        money -= p.getPrice();
       bonusPoint += p.getBonusPoint();
        System.out.println(p.toString()+"을(를)"+p.getPrice()+"만원에 구매하였습니다.");

    }

    public void printState() {
        System.out.printf("나의 남은 돈은 %,d만원 입니다. 보너스점수는 %,d점 입니다.\n", money,bonusPoint);
    }
}

class Product {
    protected int price;
    protected int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price*0.1);
    }

    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }

}

class Tv2 extends Product {
    public Tv2(){
        super(100);

    }

    public String toString() {
        return "Tv";
    }
}



class Computer extends Product{
    public Computer(){
        super(200);
    }       // 생성자와 메소드와 다른점은  생성자는 1. 리턴타입이 없다. 2.클래스명이랑 똑같다.
    public String toString(){       // 주소값과 클래스명 안에있는 오버라이딩 이다.
        return "Computer";
    }  // 오버라이딩 Object를 오버라이딩 하였다.

}