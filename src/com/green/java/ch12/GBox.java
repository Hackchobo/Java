package com.green.java.ch12;

public class GBox<T> {
    private T obj; // T적는 부분에 타입을 정해주면 그것만 된다.

    public void setItem(T obj){
        this.obj = obj;
    }

    public T getItem(){
        return this.obj;
    }
}
