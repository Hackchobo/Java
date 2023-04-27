package com.green.java.ch07.abstract2;

public interface Fightable { // 인터페이스는 무조건 추상 메소드 이다. 참고로 다중상속이 된다.
    // 인터페이스는 형용사로 이름을 짓는다. ~~able
    void sum (int x, int y);
    void move(int x, int y); // abstract을 안적어 줘도 된다. public이 그냥 적힌다.
}
