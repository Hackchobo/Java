package com.green.java.ch07.arraylist;

public class MyArrayList {
    private int[] items;
    public MyArrayList(){
        items = new int[0];
      //  System.out.println(items.length);
    }

    public void add(int value) {
        int[] temp = new int[items.length +1];
        temp[items.length] = value;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];

        }
        items = temp;

    }
    public void add(int idx, int value){
        if(idx > items.length){return;}
        int[] temp = new int[items.length +1];
        temp[idx] = value;
        for (int i = 0; i < items.length; i++) {

            if (i<idx){
                temp[i] = items[i];
            }else {
                temp[i+1] = items[i];
            }
        }
        items = temp;
    }
    @Override
    public String toString() {
        String str = "[";
        if(items.length>0){
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str+= ", "+items[i];
            }
        }
        str +="]";
        return str;
    }
    /*public void add(int num) {
        int[] temp = new int[items.length+1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        temp[temp.length-1] = num;
        items = temp;

        }*/
        /*void print(){
            for ( int i : items){
                System.out.println(i);
            }
        }*/

}