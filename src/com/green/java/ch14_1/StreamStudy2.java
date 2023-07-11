package com.green.java.ch14_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy2 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 3, 4, 5, 4, 3, 20, 10, 100, 200, 300);

        //distinct - 중복값 제거, skip(2) 앞에 2개의 값 제거, limit(3) 앞의 3개의 값만 보여줌
        List<Integer> resultList = intList.stream()
                                        .distinct()
                                        .skip(2)
                                        .limit(3)
                                        .toList(); // 최종 연산이다.

        System.out.println(intList);
        System.out.println(resultList);

        IntStream.range(1,5).forEach(System.out::println);// 1~4까지의 리스트가 만들어 진다.

        System.out.println("-----------");
        IntStream.range(1,5).forEach(System.out::println);// 1~4까지의 리스트가 만들어 진다.
        IntStream.rangeClosed(1,5).forEach(System.out::println);// 1~5까지의 리스트가 만들어 진다.

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        List<Integer> list3 = Arrays.stream(IntStream.rangeClosed(1,100).toArray())
                                    .boxed()
                                    .collect(Collectors.toList());
        List<Integer> list4 = IntStream.rangeClosed(1,100).boxed().toList(); // 위에 코드는 해당 코드랑 비슷하게 된다.
        System.out.println(list4);
//        int[] arr2 = IntStream.rangeClosed(1,100).toArray();
//        List<Integer> list3 = new ArrayList<>(Arrays.asList(arr2))


    }
}
