package com.hikvision.rensu.lambda.chapter1;

import com.hikvision.rensu.lambda.common.Artist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rensu on 17/3/10.
 */
public class ArtistTest {

    static public List<Artist> getArtistFromSHList(List<Artist> artists){
        return artists.stream()
                .filter(artist -> artist.isFrom("shanghai"))
                .collect(Collectors.toList());
    }

    static public long getCountOfShanghai(List<Artist> artists){
        return artists.stream().filter(artist -> artist.isFrom("shanghai")).count();
    }

    @Test
    public void TestCount(){
        List<Artist> artistList = Arrays.asList(new Artist("rensu", "shanghai"),
                new Artist("cao", "beijing"), new Artist("fang", "shanghai"));
        long count = getCountOfShanghai(artistList);

        Assert.assertEquals(2, count);
    }

    @Test
    public void TestList(){
        List<Artist> artistList = Arrays.asList(new Artist("rensu", "shanghai"),
                new Artist("cao", "beijing"), new Artist("fang", "shanghai"));

        List<Artist> filterList = getArtistFromSHList(artistList);

        Assert.assertEquals(Arrays.asList(new Artist("rensu", "shanghai"), new Artist("fang", "shanghai")), filterList);
    }

    @Test
    public void stringListTest(){
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());

        Assert.assertEquals(Arrays.asList("a", "b", "c"), collected);
    }
}
