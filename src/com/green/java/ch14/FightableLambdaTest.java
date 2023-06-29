package com.green.java.ch14;

public class FightableLambdaTest {
    public static void run(Fightable f) {
        f.punch();
    }
    public static void main(String[] args) {
        Fightable f1 = () -> { // ()파라미터만 적는다., -> 함수의 시작이다
            System.out.println("크크크");
        };
        run(f1);
        /*
        Fightable f1 = new Fightable() { // 익명클래스를 객체화까지 하는작업임!!!!!
            @Override
            public void punch() {
                System.out.println("크크크크");
            }
        }; 이걸 람다식으로 한것이 위에 소스임!!!
         */

        Fightable f2 = new Fightable() {
            @Override
            public void punch() {
                System.out.println("크크크크");
            }
        };
    }
}
