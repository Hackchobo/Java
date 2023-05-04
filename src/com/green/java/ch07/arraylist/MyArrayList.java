package com.green.java.ch07.arraylist;

public class MyArrayList {
    private int[] items;
    public MyArrayList(){
        items = new int[0];
      //  System.out.println(items.length);
    }

    public void add(int value) {
        int[] temp = new int[items.length +1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];

        }
        temp[items.length] = value;
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
    public int size() {
        return items.length;
    }

    public int get(int idx) {
        return items[idx];
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

    void bubbleSort () {

        for (int i = items.length -1; i>0;i--){
            for (int z = 0; z < i; z++) {
                int sideIdx = z +1;
                if(items[z] > items[sideIdx]){
                    int temp = items[z];
                    items[z] = items[sideIdx];
                    items[sideIdx] = temp;
                }
            }
        }

        /*for (int i = items.length-1; i > 0 ; i--) {
            for (int z = 0; z < i; z++) {
                if(items[z]>items[z+1]){
                    int temp = items[z];
                    items[z] = items[z+1];
                    items[z+1] = temp;
                }

            }

        }*/

        /*for (int i = 1; i < items.length ; i++) {
            for (int j = 0; j < items.length-i; j++) {
//                int temp = 0 ;
                if(items[j]>items[j+1]){
                    int temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }
        }*/
    }

    public void set(int idx, int num) {
        items[idx] = num;
    }

    public boolean contains(int num) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] ==num){
                return true;
            }
        }
        return false;
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