package com.hikvision.rensu.lambda.chapter2;

import java.util.stream.Stream;

/**
 * Created by rensu on 2017/3/13.
 */
public class FrequentStream {
    public static void main(String[] args) {
        FrequentStream f = new FrequentStream();

        System.out.println(f.addUp(Stream.of(1, 2, 3, 5)));
    }

    int addUp(Stream<Integer> numbers) {
        int add = numbers.reduce(0, (a, b) -> a + b);
        return add;
    }
}
