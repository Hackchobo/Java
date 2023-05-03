package com.green.java.ch07;

public class Human {
    private String name; // 생성자를 통해서 값을넣는방법 1, 사용방법 우클후 제너럴 콘스트럭처 전체선택
    private int age;
    private String job;

//    public Human() {
//        super(); // 부모생성자에 기본생성자 호출
//    }

    public Human(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName(){            // getter은 반환형에 get으로 한다.
        return this.name;               // this.은 생략 가능하다.
    }
    public int getAge(){
        return this.age;
    }
    public String getJob(){
        return job;
    }

//    public void setName(String name) {
//        this.name=name;
//    }//세터는 무조건 보이드를 사용하고 타입은 무조건 private를 따르며 네임도 똑같이 해준다. 멤버필드의 이름을 사용하려면 this를 이용하여야한다.
//    public void setAge(int age) { // 카멜케이스 기법으로 만들어 주어야 한다.
//        this.age=age;
//    }
//    public void setJob(String job){
//        this.job=job;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }
}


