package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        Box3<Car> box = new Box3();
        FruitBox<Fruit> fBox = new FruitBox();
        fBox.add(new Fruit());
        fBox.add(new Apple());
        fBox.add(new Grape());

        FruitBox<Apple> aBox = new FruitBox<>();

    }
}

class Fruit2 {

    @Override
    public String toString() { // 오버라이딩이다.
        return "Fruit";
    }
}

class Apple2 extends Fruit{
    @Override
    public String toString() { // 오버라이딩이다.
        return "Apple";
    }
}

class Grape2 extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy2 {
    @Override
    public String toString() {
        return "Toy";
    }
}

class FruitBox<T extends Fruit> extends Box3<T> { // 첫번째 익스텐즈는 Fruit 밑으로만 두번째는 참조하는 구문이 된다.

}

class Box3<T> {
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
