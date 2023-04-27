package com.green.java.ch07.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(30);
        myList.add(30);

        myList.add(6, 100);


        System.out.println(myList.toString());

        System.out.println(myList.size());
        //[10,20,30]
     //   myList.print();

        for (int i = 0; i < myList.size() ; i++) {
            /*int v1 = myList.get(i);
            System.out.println(v1);*/
            System.out.println(myList.get(i));
        }
        System.out.println("--------------------");
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
//            int val = myList.get(i);
//            sum = sum + val;
            sum += myList.get(i);
        }
        System.out.println(sum);

    }
}
