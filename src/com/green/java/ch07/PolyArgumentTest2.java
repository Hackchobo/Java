package com.green.java.ch07;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy(new Tv3());
        b.buy(new Computer3());
        b.buy(new Audio3());
        b.buy(new Audio3());
        b.summary();
        // 구입하신 제품은 Tv, Computer, Audio, Audio 총 4개입니다.
    }
}
class Buyer3 {
    private int money;
    private int bonusPoint;
    private Product3[] items; //배열은 범위가 정해져있고 더담으려면 배열한개더생성
    private int idx;

    Buyer3(){
        this.money = 1000;
        this.bonusPoint = 0;
        this.items = new Product3[10]; // 배열은 10개밖에 저장을 하지 못한다.
        this.idx = 0;
        printState();
    }

    public void buy(Product3 p){        // 로컬변수는 지역만 하고 죽는다.
//        int productPrice = p.getPrice();
        for (int i = 0; i < items.length; i++) {
            if(items[i] == null){
                items[i] = p;
                break;
            }
        }
//        money -= p.getPrice();
//        bonusPoint += p.getBonusPoint();
//        System.out.println(p.toString()+"을(를)"+p.getPrice()+"만원에 구매하였습니다.");
            items[idx++] = p;       //최초는 0을 사용하고 다음에 할때는 1 그다음 2 이런식으로 된다.
            money -= p.getPrice();
            bonusPoint += p.getBonusPoint();
            System.out.println(p.toString()+"을(를)"+p.getPrice()+"만원에 구매하였습니다.");
    }

    public void summary() {
        System.out.print("구입하신 제품은");
        if(idx > 0 ){
            System.out.printf("%s", items[0]);
            for (int i = 0; i < idx; i++) {
                System.out.printf(", %s", items[i]);
            }
        }
        /*System.out.print("구입하신 제품은 ");
        for (int i = 0; i <idx ; i++) {
            if(i !=0) {
                System.out.print(", ");
            }
            System.out.print(items[i]);
        }
        System.out.printf(" 총 %,d개 입니다.",idx);*/

    }

    public void printState() {
        System.out.printf("나의 남은 돈은 %,d만원 입니다. 보너스점수는 %,d점 입니다.\n", money,bonusPoint);
        System.out.println();
    }
}

class Product3 {
    protected int price;
    protected int bonusPoint;

    Product3(int price){
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

class Tv3 extends Product3 {
    public Tv3(){
        super(100);

    }

    public String toString() {
        return "Tv";
    }
}



class Computer3 extends Product3{
    public Computer3(){
        super(200);
    }       // 생성자와 메소드와 다른점은  생성자는 1. 리턴타입이 없다. 2.클래스명이랑 똑같다.
    public String toString(){       // 주소값과 클래스명 안에있는 오버라이딩 이다.
        return "Computer";
    }  // 오버라이딩 Object를 오버라이딩 하였다.

}

class Audio3 extends Product3 {
    public Audio3() {super(50);}
    public String toString(){return "Audio";}
}

