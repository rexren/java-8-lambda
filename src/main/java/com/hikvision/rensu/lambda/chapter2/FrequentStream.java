package com.hikvision.rensu.lambda.chapter2;

import com.hikvision.rensu.lambda.chapter1.Album;
import com.hikvision.rensu.lambda.chapter1.Artist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rensu on 2017/3/13.
 */
public class FrequentStream {

    public static int addUp(Stream<Integer> numbers) {
        int add = numbers.reduce(0, (a, b) -> a + b);
        return add;
    }

    public static List<String> nameAndNationality(List<Artist> artists) {
        List<String> s = artists.stream()
                        .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
                        .collect(Collectors.toList());
        return s;
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        List<Album> albums = input.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(Collectors.toList());

        return albums;
    }

    @Test
    public void addUpTest() {
        int result = addUp(Stream.of(1, 2, 3, 5));
        Assert.assertEquals(11, result);
    }

    @Test
    public void nameAndNationalityTest() {

    }
}
