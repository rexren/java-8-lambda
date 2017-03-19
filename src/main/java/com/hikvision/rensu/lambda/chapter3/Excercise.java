package com.hikvision.rensu.lambda.chapter3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

/**
 * Created by rensu on 17/3/18.
 */
public class Excercise {

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



    static public String mostUsedLowercaseChar(List<String> strings){
        return strings.stream().max(Comparator.comparing(Excercise::countLowCaseCharNumber)).get();
    }

}
