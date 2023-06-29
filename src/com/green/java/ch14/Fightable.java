package com.green.java.ch14;
@FunctionalInterface // 람다식에서는 두개를 사용하지 못한다 그러므로 이구문을 써주는게 좋다.
public interface Fightable {
    void punch(); // 키워드가 생략 되어있다 public abstract , 추상 이며 구현부가 없다.

}
