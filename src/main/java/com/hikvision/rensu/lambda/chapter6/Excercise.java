package com.hikvision.rensu.lambda.chapter6;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by rensu on 17/3/20.
 */
public class Excercise {

    public static void main(String[] args) {
        //TODO:
        // 1.顺序求列表中数字的平均值
        // 2.把列表中的数字相乘,然后再讲所得结果乘以5,该实现有个缺陷
        // 3.求列表元素的平方和,该实现性能不高
    }

    public static int sequentialSumOfSquares(IntStream range) {
        return range.map(x -> x * x).sum();
    }

    public static int sequentialSumOfSquaresWithPara(IntStream range) {
        return range.parallel().map(x -> x * x).sum();
    }

    public static int multiplyThrough(List<Integer> linkedListOfNumbers) {
        return linkedListOfNumbers.parallelStream().reduce(5, (acc, x) -> acc * x);
    }
}
