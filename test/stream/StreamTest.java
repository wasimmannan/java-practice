package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        final int function =2;
        Stream<Integer> stream = numbers.stream().map(e -> e*function);
        System.out.println(stream.sorted().collect(Collectors.toList()));
        System.out.println("The end!");
    }
}
