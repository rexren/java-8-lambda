package com.hikvision.rensu.lambda.chapter5;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by rensu on 17/3/20.
 */
public class ParaSum {

    private final List<Integer> testValues = IntStream.range(1, 1000000).boxed().collect(Collectors.toList());

    public static int addInteger(List<Integer> values) {
        int i = 0;
        for (Integer a : values) {
            i += a;
        }
        return i;
    }

    public static int addIntegerParaStream(List<Integer> values) {
        return values.parallelStream().mapToInt(Integer::intValue).sum();
    }

    @Test
    public void method1(){
        Assert.assertEquals(1783293664,addInteger(testValues));
    }

    @Test
    public void method2(){
        Assert.assertEquals(1783293664,addIntegerParaStream(testValues));
    }

}
