package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        /*Juice j1 = new Juice("레몬");
        System.out.println(j1);*/
        Box4<Fruit3> fruitBox = new Box4();
        fruitBox.add(new Fruit3());
        fruitBox.add(new Apple3());
        fruitBox.add(new Grape3());
        Juicer.makejuice(fruitBox);

        Box4<Toy3> toyBox = new Box4();
        //Juicer.makejuice(toyBox);
    }
}
class Juicer {
    public static Juice makejuice(Box4<? extends Fruit3> box){ // 오류가 뜨는 이유는 Juice 와 FruitBox만 받는 거라 그러하다.
        return null;
    }

}
class Juice {
    private String name;
    public Juice(String name){
        this.name = name + "주스";
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Fruit3 {

    @Override
    public String toString() { // 오버라이딩이다.
        return "Fruit";
    }
}

class Apple3 extends Fruit3{
    @Override
    public String toString() { // 오버라이딩이다.
        return "Apple";
    }
}

class Grape3 extends Fruit3 {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy3 { public String toString() { return "Toy"; } };


class FruitBox3<T extends Fruit> extends Box4<T> { // 첫번째 익스텐즈는 Fruit 밑으로만 두번째는 참조하는 구문이 된다.

}

class Box4<T> {
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
