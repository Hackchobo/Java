package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        /*Fruit f = new Fruit();
        System.out.println(f);

        Apple a = new Apple();
        System.out.println(a);*/

        Box2<Fruit> fruitBox = new Box2();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
//        fruitBox.add(new Toy()); // 못넣는이유는 Fruit 이라서 못넣는다 넣으려면 익스텐스 해줘야됨

        /*int size = fruitBox.size();
        System.out.println(size);*/

        Box2<Apple> appleBox = new Box2();
//        appleBox.add(new Fruit()); // 자식은 부모타입을 넣어줄수 없다. 절대 네버
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Apple a = appleBox.get(2); // 굳이 형변환을 안해줘도 된다.
//        appleBox.add(new Toy());
//        appleBox.add(new Grape());

    }
}

class Fruit {

    @Override
    public String toString() { // 오버라이딩이다.
        return "Fruit";
    }
}

class Apple extends Fruit{
    @Override
    public String toString() { // 오버라이딩이다.
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

class Box2<T> {
    private List<T> list = new ArrayList();
    public void add(T item) {list.add(item);}
    public T get(int idx) { return list.get(idx);}

    public int size() {
        return list.size();
    }
    public String toString() {
        return list.toString();
    }
}
