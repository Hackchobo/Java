package com.green.java.ch12;

public class GenericsStudy1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3();
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        Box3<Apple> appleBox = new Box3();
//        Box3<Fruit> fruitBox2 = (Box3<Fruit>)appleBox; // 제네릭의 불공변성이다. 제네릭의 형변환은 절대 안된다.
    }
}
