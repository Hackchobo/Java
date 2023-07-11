package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

@FunctionalInterface
interface MyFunction2 {
    int apply(int p);
}

public class MyArrayList {
    private int[] arr;

    public MyArrayList(){
        this.arr = new int[0];
    }



    public void add(int num){
        int[] temp = new int[arr.length+1];
        temp[arr.length] = num;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void forEach(MyConsumer consumer){
        for (int i = 0; i < this.arr.length; i++) {
            consumer.accept(this.arr[i]);
        }
    }

    public MyArrayList filter(MyPredicate predicate) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public MyArrayList map(MyFunction2 function2) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < this.arr.length; i++) {
            list.add(function2.apply(arr[i]));
        }
        return list;
    }

    public void removeIf(MyPredicate predicate){
        //false로 넘어오는거 살리자.
        int idx = 0;
        int[] temp = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            if (!predicate.test(this.arr[i])) {
                temp[idx] = this.arr[i];
                idx++;
            }
        }

        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        this.arr = temp2;
        /*int idx = 0;
        int[] temp = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            if(!predicate.test(this.arr[i])){
                temp[idx] = this.arr[i];
                idx++;
            }
        }

        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        this.arr = temp2;*/
        /*int idx = 0;
        int[] temp = new int[this.arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!predicate.test(arr[i])){
                temp[idx] = this.arr[i];
                idx++;
            }
        }

        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        this.arr = temp2;*/

        /*int idx = 0;
        int[] temp = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            if (predicate.test(this.arr[i])){
                temp[idx] = this.arr[i];
                idx++;
            }
        }

        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        this.arr = temp2;*/

        /*int idx = 0;
        int[] temp = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            int val = this.arr[i];
            boolean b = predicate.test(val);
            if(b == false){
                temp[idx] = val;
                idx++;
            }
        }
        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        this.arr = temp2;*/
    }

    public void replaceAll(MyFunction2 fn) {
        for (int i = 0; i < this.arr.length; i++) {
                this.arr[i] = fn.apply(this.arr[i]);
        }
    }


    public static MyArrayList asList(int... num){
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }
        return list;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.arr.length; i++) {
            if(i>0) { sb.append(", ");}
            sb.append(this.arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }






   /* public MyArrayList() {
        this.arr = new int[0];
    }

    public void add(int val){
        int[] temp = new int[arr.length+1];
        temp[arr.length] = val;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }*/
    /*public MyArrayList() {
        this.arr = new int[0];
    }

    public void add(int num){
        int[] temp = new int[arr.length];
        temp[arr.length] = num;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }*/

}


