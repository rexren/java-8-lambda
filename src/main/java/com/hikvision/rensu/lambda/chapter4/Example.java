package com.hikvision.rensu.lambda.chapter4;

import com.com.hikvision.rensu.lambda.common.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.LongSummaryStatistics;

/**
 * Created by rensu on 17/3/18.
 */
public class Example {
    public static void printTrackLengthStatistics(Album album) {
        LongSummaryStatistics trackLengthStats = album.getTracks()
                .mapToLong(t -> t.getLength()).summaryStatistics();

        System.out.println(trackLengthStats);
    }

    public static LongSummaryStatistics getTrackStatistics(Album album) {
        return album.getTracks().mapToLong(Track::getLength).summaryStatistics();
    }

    /**
     * Summary statics for number statics
     */
    @Test
    public void printTrackLengthStatisticsTest() {
        System.out.println(SampleData.manyTrackAlbum);
        printTrackLengthStatistics(SampleData.manyTrackAlbum);

        LongSummaryStatistics s = getTrackStatistics(SampleData.manyTrackAlbum);
        System.out.println(s.getAverage());
    }


    @Test
    public void parentDefaultUsed() {
        Parent parent = new ParentImp();
        parent.welcome();
        Assert.assertEquals("Parent: Hi!", parent.getLastMessage());
    }


    @Test
    public void childDefaultUsed() {
        Child child = new ChildImp();
        child.welcome();
        Assert.assertEquals("Child: Hi!", child.getLastMessage());
    }

    @Test
    public void concrteBeatsDefault(){
        Parent p = new OverrideParent();
        p.welcome();
        Assert.assertEquals("Class Parent: Hi!", p.getLastMessage());
    }
}
