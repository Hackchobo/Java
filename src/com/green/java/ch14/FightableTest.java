package com.green.java.ch14;

public class FightableTest {

    public static void run(Fightable f) {
        f.punch();
    }
    public static void main(String[] args) {
        StreetFighter sf= new StreetFighter();
        //sf.punch(); // PHP에서는 . 대신 -> 을 사용 한다.
        run(sf);

        run(new Fightable(){            // 인터페이스를 객체화할수없다 고로 익명클래스를 사용한것임(익명을 객체화까지)
            @Override
            public void punch() {
                System.out.println("머리 박치기를 한다.");
            }
        });

        Fightable f1 = new Fightable() { // 익명클래스를 객체화까지 하는작업임!!!!!
            @Override
            public void punch() {
                System.out.println("크크크크");
            }
        };
    }
}

class StreetFighter implements Fightable { // 강제성이 있다. 신뢰가 있다. 구현부가 있어야 된다.
    @Override
    public void punch() {
        System.out.println("주먹을 날린다.");
    }

}
