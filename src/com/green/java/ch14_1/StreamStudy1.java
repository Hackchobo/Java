package com.green.java.ch14_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy1 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 3, 4, 5, 4, 3, 20, 10);
        Stream<Integer> intStream = intList.stream();
        intStream.forEach(System.out::println);

        System.out.println("--------");
        intList.stream().distinct().forEach(System.out::println); // 중복값을 지워준다.
        System.out.println("--------");
        intList.stream().distinct().skip(2).forEach(System.out::println); // 앞에 값 2개를 지워준다.
        System.out.println("--------");
        intList.stream().distinct().limit(3).forEach(System.out::println); // 앞에 3개만 보여준다.
        System.out.println("--------");

        intList.stream()
                .distinct()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("--------");
        int[] intArr = {99, 1, 2, 9, 3, 110, 4, 5};
        IntStream intArrStream = Arrays.stream(intArr); // 속도가 더빠를수가 있다.
        intArrStream.sorted().forEach(System.out::println); // sorted 값을 정렬시켜준다., 원본은 건들지 않는다.
        System.out.println(Arrays.toString(intArr));

//        Stream<int[]> intArrStream = Stream.of(intArr);
    }
}
