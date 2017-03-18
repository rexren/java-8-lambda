package com.hikvision.rensu.lambda.chapter3;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by rensu on 17/3/18.
 */
public class Excercise {

    static public int countLowCaseCharNumber(String string){
        long number = string.chars().filter(Character::isLowerCase).count();
//        long number = string.chars().filter(c->Character.isLowerCase(c)).count();
        return (int)number;
    }

    static public String mostUsedLowercaseChar(List<String> strings){
       return strings.stream().max(Comparator.comparing(Excercise::countLowCaseCharNumber)).get();
//       return strings.stream().max(Comparator.comparing(c->countLowCaseCharNumber(c)));
    }


    @Test
    public void lowcaseTest(){
        Assert.assertEquals(0, countLowCaseCharNumber(""));
        Assert.assertEquals(1, countLowCaseCharNumber("aA"));
        Assert.assertEquals(4, countLowCaseCharNumber("aAbdDDl"));
    }

    @Test
    public void mostUsedLowerCaseStirngsTest(){
        Assert.assertEquals("a", mostUsedLowercaseChar(Arrays.asList("a", "A")));
        Assert.assertEquals("afdsafsa", mostUsedLowercaseChar(Arrays.asList("afdsafsa", "abc", "AcnaD", "A")));
    }
}
