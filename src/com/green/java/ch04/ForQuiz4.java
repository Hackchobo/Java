package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;

 /*       for(int i= 0; i<star; i++ ){
            for (int j=0; j<star-i; j++){
                System.out.print(" ");
            }
            for (int j= 0; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }*/
      /*  for(int i=0;i<star;i++){
            String a= "";
            for(int j=0;j<=i;j++){
                a += "*";
            }*/


            /*for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.printf("%5s",a);
            System.out.println();        */

            for (int i =star; i>0; i--){
                for(int z=1; z<=star;z++){
                    if(z <i){
                        System.out.print("_");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
        }
    }
}
