package com.green.java.ch14;
@FunctionalInterface
interface MyFunction {
    void run();
}
public class LambdaEx1 {
    static void execute(MyFunction f) { f.run();}

    public static void main(String[] args) {
        //MyFunction mf1 = () -> System.out.println("mf1");
        MyFunction mf1 = getMyFunction();
        mf1.run(); // "mf1"
        execute(getMyFunction());
    }

    public static MyFunction getMyFunction() {
        /*MyFunction mf1 = () -> System.out.println("mf1");

        return mf1;*/
        return () -> System.out.println("mf1");
    }
}
