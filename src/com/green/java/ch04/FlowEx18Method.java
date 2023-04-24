package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {

/*        gugudan(4);*/

        /*
        4 X1 = 4
        ..
        4 X 9 = 36 (개행)
         */
        //arguments 아규먼츠, 인수
        gugudan(2, 8); // 단이 바뀌면 개행 한번더
        gugudan(5, 7); // 단이 바뀌면 개행 한번더

    }

    public static void gugudan(int sDan, int eDan){ // 인자, 파라미터, 매개변수
        for (int i = sDan; i <=eDan ; i++) {
            gugudan(i);
            /*for (int j = 1; j < 10 ; j++) {
                System.out.printf("%d X %d = %d\n",i,j,i*j);
            }*/
        }

    }
    public static void gugudan(int num){
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %d\n",num,j,num*j);
            }
        System.out.println();
    }
}
