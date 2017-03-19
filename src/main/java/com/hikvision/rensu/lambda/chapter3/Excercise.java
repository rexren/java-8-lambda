package com.hikvision.rensu.lambda.chapter3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

/**
 * Created by rensu on 17/3/18.
 */
public class Excercise {

    private final String s1 = "fhfudisoahf inpGYUERTYUIOP:L<MNBVDRTYUIOL<MNBFTYUIOLKMNBVFRTYUIIUOINSFJIOHBOIGFSUIODhupsdhafiopb hfubsoha UI GUIGALNJFMIOHGUNSOUHIIfjaghiuonh usanfihUIBGIFUHSIhfuihgaio ou";
    private final String s2 = "fdhfudisoahf inpGYUIUOINSFRTYUIKMNBVFTYUIKJNBVFTYUIKMNBFTYUIKJNBFTYUIJHBFTYUIKMJIOHBOIGFSUIODhupsdhafiopb hfubsoha UI GUIGALNJFMIOHGUNSOUHIIfjaghiuonh usanfihUIBGIFUHSIhfuihgaio ou";

    static public long countLowCaseCharNumber(String string){
        return string.chars().filter(Character::isLowerCase).count();
    }

    static public long countLowCaseCharNumberWithPara(String str){
        return str.chars().parallel().filter(Character::isLowerCase).count();
    }

    static public long coutFor(String str){
        long count = 0;
        for (int i=0;i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i))){
                count++;
            }

        }
        return count;
    }

    @Test
    public void testTimeFor(){
        Assert.assertEquals(62, coutFor(s1));
        Assert.assertEquals(63, coutFor(s2));
    }

    @Test
    public void testTimeStream(){
        Assert.assertEquals(62, countLowCaseCharNumber(s1));
        Assert.assertEquals(63, countLowCaseCharNumber(s2));
    }

    @Test
    public void testTimeWithPara(){
        Assert.assertEquals(62, countLowCaseCharNumberWithPara(s1));
        Assert.assertEquals(63, countLowCaseCharNumberWithPara(s2));

    }

    static public String mostUsedLowercaseChar(List<String> strings){
        return strings.stream().max(Comparator.comparing(Excercise::countLowCaseCharNumber)).get();
    }

    @Test
    @Ignore
    public void lowcaseTest(){
        Assert.assertEquals(0, countLowCaseCharNumber(""));
        Assert.assertEquals(1, countLowCaseCharNumber("aA"));
        Assert.assertEquals(4, countLowCaseCharNumber("aAbdDDl"));
    }

    @Test
    @Ignore
    public void mostUsedLowerCaseStirngsTest(){
        Assert.assertEquals("a", mostUsedLowercaseChar(Arrays.asList("a", "A")));
        Assert.assertEquals("afdsafsa", mostUsedLowercaseChar(Arrays.asList("afdsafsa", "abc", "AcnaD", "A")));
    }

}
