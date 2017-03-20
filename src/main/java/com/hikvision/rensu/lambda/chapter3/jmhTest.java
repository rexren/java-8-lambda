package com.hikvision.rensu.lambda.chapter3;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Created by rensu on 17/3/20.
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
public class JMHTest {


    public static final String s1 = "fhfudisoahf inpGYUERTYUIOP:L<MNBVDRTYUIOL<MNBFTYUIOLKMNBVFRTYUIIUOINSFJIOHBOIGFSUIODhupsdhafiopb hfubsoha UI GUIGALNJFMIOHGUNSOUHIIfjaghiuonh usanfihUIBGIFUHSIhfuihgaio ou";
    public static final String s2 = "fdhfudisoahf inpGYUIUOINSFRTYUIKMNBVFTYUIKJNBVFTYUIKMNBFTYUIKJNBFTYUIJHBFTYUIKMJIOHBOIGFSUIODhupsdhafiopb hfubsoha UI GUIGALNJFMIOHGUNSOUHIIfjaghiuonh usanfihUIBGIFUHSIhfuihgaio ou";

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + JMHTest.class.getSimpleName() + ".*")
                .forks(1)
                .build();
        new Runner(opt).run();
    }

    @GenerateMicroBenchmark
    public void testTimeFor() {
        Excercise.coutFor(s1);
    }

    @GenerateMicroBenchmark
    public void testTimeStream() {
        Excercise.countLowCaseCharNumber(s1);
    }

    @GenerateMicroBenchmark
    public void testTimeWithPara() {
        Excercise.countLowCaseCharNumberWithPara(s1);
    }

}
