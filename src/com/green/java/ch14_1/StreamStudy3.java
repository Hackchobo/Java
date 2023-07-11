package com.green.java.ch14_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy3 {
    public static void main(String[] args) {
       /* Stream<Integer> evemStream = Stream.iterate(1, n -> n+2); // iterate는 무한반복한다. 단 최종연산이 있으므로 무한이 안돌아간다.
        evemStream.limit(1000).forEach(System.out::println);

        List<Integer> list = Stream.iterate(1, n -> n+2).toList(); // 또다시 하려면 또생성 해주어야 한다.*/

//        double a =665.1+(9.56 * 168)+(1.85 * 48)-(4.68 * 29);
//
//        System.out.println(Math.round(a*100)/100.0);
//
//        double a1 = 665.1+(9.56 * 168)+(1.85 * 48)-(4.68 * 29);
//        System.out.println(Math.round(a1*100)/100.0);
    }
}
