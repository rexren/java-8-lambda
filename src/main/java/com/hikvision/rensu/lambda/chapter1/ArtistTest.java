package com.hikvision.rensu.lambda.chapter1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rensu on 17/3/10.
 */
public class ArtistTest {
    public static void main(String[] args) {
        List<Artist> artistList = Arrays.asList(new Artist("rensu", "shanghai"),
                new Artist("cao", "beijing"), new Artist("fang", "shanghai"));

        long count = artistList.stream().filter(artist -> artist.isFrom("shanghai")).count();

        System.out.println("The number of artist from shanghai is " + count);


        List<Artist> arts = artistList.stream()
                .filter(artist -> artist.isFrom("shanghai"))
                .collect(Collectors.toList());


        System.out.println(arts);
    }
}
