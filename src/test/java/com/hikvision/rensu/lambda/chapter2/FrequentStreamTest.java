package com.hikvision.rensu.lambda.chapter2;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by rensu on 2017/3/13.
 */
public class FrequentStreamTest {

    @Test
    public void addUpTest() {
        int result = FrequentStream.addUp(Stream.of(1, 2, 3, 5));
        Assert.assertEquals(11, result);
    }

}
