package com.hikvision.rensu.lambda.chapter1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rensu on 17/3/10.
 */
public class CollectTest {
    public static void main(String[] args) {
        List<String> collected = Stream.of("a", "b", "c")
                .collect(Collectors.toList());

        List<String> d = collected.stream()
                .map(s -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println(d);

    }
}
