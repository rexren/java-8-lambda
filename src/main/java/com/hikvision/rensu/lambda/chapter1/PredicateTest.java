package com.hikvision.rensu.lambda.chapter1;

import java.util.function.Predicate;

/**
 * Created by rensu on 17/3/10.
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x > 5;
    }
}
