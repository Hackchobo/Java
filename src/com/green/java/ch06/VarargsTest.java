package com.green.java.ch06;

public class VarargsTest {
    public static void main(String[] args) {
        sum(1); //sum: 1
        sum(1, 3); //sum: 4
        sum(1, 3, 3); //sum: 7
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //sum: 55

        int[] arr = { 1, 2, 3 };
        sum(arr);
    }

    static void sum(int... nums) { // int... 은 배열을 하는것이다.
        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
        for(int val : nums) { // 순서가 있으면 for, foreach 문을 사용 할수있다.
             sum += val;
        }
        System.out.println("sum: " + sum);
    }
}
