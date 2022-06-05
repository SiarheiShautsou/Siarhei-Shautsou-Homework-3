package com.sheva.domain;

import java.util.Arrays;
import java.util.List;


public class StreamTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(111, 222, 333, 777, 999, 777);

        int sum = list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum();

        System.out.println(sum);
        System.out.println((list.stream().skip(2).limit(2)));

    }
}
