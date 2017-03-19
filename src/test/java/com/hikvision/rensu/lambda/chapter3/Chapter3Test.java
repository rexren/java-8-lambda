package com.hikvision.rensu.lambda.chapter3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by rensu on 17/3/19.
 */
public class Chapter3Test {

    public static final String s1 = "fhfudisoahf inpGYUERTYUIOP:L<MNBVDRTYUIOL<MNBFTYUIOLKMNBVFRTYUIIUOINSFJIOHBOIGFSUIODhupsdhafiopb hfubsoha UI GUIGALNJFMIOHGUNSOUHIIfjaghiuonh usanfihUIBGIFUHSIhfuihgaio ou";
    public static final String s2 = "fdhfudisoahf inpGYUIUOINSFRTYUIKMNBVFTYUIKJNBVFTYUIKMNBFTYUIKJNBFTYUIJHBFTYUIKMJIOHBOIGFSUIODhupsdhafiopb hfubsoha UI GUIGALNJFMIOHGUNSOUHIIfjaghiuonh usanfihUIBGIFUHSIhfuihgaio ou";

    @Test
    public void testTimeFor(){
        Assert.assertEquals(62, Excercise.coutFor(s1));
        Assert.assertEquals(63, Excercise.coutFor(s2));
    }

    @Test
    public void testTimeStream(){
        Assert.assertEquals(62, Excercise.countLowCaseCharNumber(s1));
        Assert.assertEquals(63, Excercise.countLowCaseCharNumber(s2));
    }

    @Test
    public void testTimeWithPara(){
        Assert.assertEquals(62, Excercise.countLowCaseCharNumberWithPara(s1));
        Assert.assertEquals(63, Excercise.countLowCaseCharNumberWithPara(s2));
    }

    @Test
    public void lowcaseTest(){
        Assert.assertEquals(0, Excercise.countLowCaseCharNumber(""));
        Assert.assertEquals(1, Excercise.countLowCaseCharNumber("aA"));
        Assert.assertEquals(4, Excercise.countLowCaseCharNumber("aAbdDDl"));
    }

    @Test
    public void mostUsedLowerCaseStirngsTest(){
        Assert.assertEquals("a", Excercise.mostUsedLowercaseChar(Arrays.asList("a", "A")));
        Assert.assertEquals("afdsafsa", Excercise.mostUsedLowercaseChar(Arrays.asList("afdsafsa", "abc", "AcnaD", "A")));
    }
}
