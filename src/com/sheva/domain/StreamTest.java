package com.sheva.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(111, 222, 333, 777, 999, 777);

        int sum = list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum();
        System.out.println(sum);

        list.stream()
                .sorted()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        String sortedList = list.stream().
                sorted(Collections.reverseOrder()).
                map(Object::toString).
                collect(Collectors.joining("! "));

        System.out.println(sortedList);


    }
}
