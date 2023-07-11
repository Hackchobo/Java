package com.green.java.ch14;

import java.util.function.*;

public abstract class LambdaEx6 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
        IntSupplier s2 = () -> (int)(Math.random()*100)+1; // 위에 것보다 속도가 빠르다.
        IntFunction<Double> iff = i-> (double) i/3;
        IntConsumer ic;
        IntPredicate ip;
        DoubleSupplier ds;
    }

}
