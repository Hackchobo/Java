package com.green.java.ch14;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList mList = new MyArrayList();
        //100 ~ 200

        for (int i = 100; i <= 200; i++) {
            mList.add(i);
        }

        //System.out.println(mList);

        IntBox ib = new IntBox();
        /*//forEach를 통하여 mList 가 가지고 있는 모든 값을 더하세요.
        mList.forEach(item-> ib.plus(item));
        //테스트로 잘 더했는지 출력.
        int sum = ib.getSum();
        System.out.println("sum : " + sum);*/

        //mList의 짝수만 전부 더해서 출력
       /* mList.forEach(item -> {
                    if (item % 2 == 0) {
                        ib.plus(item);
                    }
                }
        );
        int result = ib.getSum();
        System.out.println(result);*/

        // 전체 숫자 더하는데 짝수만 *2 해서 더하기
        final IntBox ib3 = new IntBox();
        mList.forEach(item -> {ib3.plus(item %2 == 0 ? item * 2 : item);});
        /*{
            if (item % 2 == 0){
                ib.plus(item * 2);
            } else{
                ib.plus(item);
            }
        });*/
        int result2 = ib.getSum();
        System.out.println(result2);

    }

}

class IntBox {
    public int sum;

    public void plus(int num) {
        this.sum += num;
    }

    public int getSum() {
        return sum;
    }
}