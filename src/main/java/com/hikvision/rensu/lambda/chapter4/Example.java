package com.hikvision.rensu.lambda.chapter4;

import com.com.hikvision.rensu.lambda.common.Album;
import com.com.hikvision.rensu.lambda.common.SampleData;
import org.junit.Test;

import java.util.LongSummaryStatistics;

/**
 * Created by rensu on 17/3/18.
 */
public class Example {
    public static void printTrackLengthStatistics(Album album){
        LongSummaryStatistics trackLengthStats = album.getTracks()
            .mapToLong(t->t.getLength()).summaryStatistics();

        System.out.println(trackLengthStats);
    }

    @Test
    public void printTrackLengthStatisticsTest(){
        System.out.println(SampleData.manyTrackAlbum);
        printTrackLengthStatistics(SampleData.manyTrackAlbum);
    }
}
