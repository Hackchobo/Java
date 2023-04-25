package com.green.java.ch07.poly;

public class Animal {
    private String name;

    public Animal() {}      //기본생성자가 있으면 각자 지역변수에 super(OOO)을 안해 줘도 된다.

    public Animal(String name){
        this.name = name;
    }

    public void crying() {
        System.out.println("동물이 운다.");
    }
}

class Dog extends Animal {
    public Dog(){
        super("바둑이");
    }

    public Dog(String name){
        super(name);        // private라서 this.name = name; 에서 오류가 뜬다.
    }
    @Override // 오버라이딩은 @를 붙이는것이다.
    public void crying() {       // 또한 부모와 이름을 맞춰야됨
        System.out.println("멍~멍~");
    }

    public void jump() {
        System.out.println("개가 점프!!");
    }
}

class Bulldog extends Dog {
    @Override // 오버라이딩은 @를 붙이는것이다.
    public void crying() {       // 또한 부모와 이름을 맞춰야됨
        System.out.println("으르렁!!");
    }
}

    class Cat extends Animal {

        @Override // 오버라이딩은 @를 붙이는것이다.
        public void crying() {       // 또한 부모와 이름을 맞춰야됨
            System.out.println("야옹 야옹");
        }
    }

    class Duck extends Animal {
        @Override // 오버라이딩은 @를 붙이는것이다.
        public void crying() {       // 또한 부모와 이름을 맞춰야됨
            System.out.println("꽥 꽥");
        }
    }