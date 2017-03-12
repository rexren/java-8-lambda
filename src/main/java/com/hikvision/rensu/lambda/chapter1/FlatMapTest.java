package com.hikvision.rensu.lambda.chapter1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rensu on 17/3/10.
 */
public class FlatMapTest {
    public static void main(String[] args) {
        List<Integer> together = Stream.of(Arrays.asList(1,2), Arrays.asList(3,4))
                .flatMap(numbers->numbers.stream()).collect(Collectors.toList());

        System.out.println(together);
    }
}
