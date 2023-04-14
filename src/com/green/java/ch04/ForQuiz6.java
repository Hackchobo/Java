package com.green.java.ch04;

public class ForQuiz6 {
    public static void main(String[] args) {

        /*
        2 X 1 = 2   3 X 1 = 3   4 X 1 = 2   5 X 1 = 2
        2 X 2 = 4   3 X 2 = 6   4 X 2 = 8   5 X 2 = 10
        ...
        2 x 9 = 18   3 x 9= 27 .......
        */

        for (int i=1;i<10;i++){
            for(int j=2;j<10; j++){
                System.out.print(j +"x"+ i +"="+i*j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
