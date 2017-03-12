package com.hikvision.rensu.lambda.chapter1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rensu on 17/3/11.
 */
public class LambdaMinandMax {

    public static void main(String[] args) {
        List<Artist> artists = Stream.of(new Artist("rensu", "london", 18), new Artist("zhushirong", "beijing", 20), new Artist("taoyan", "beijing", 34))
                .collect(Collectors.toList());

        Artist art = artists.stream().min((a1, a2) -> a1.getAge() - a2.getAge()).get();
        Artist artMinAge = artists.stream().min(Comparator.comparing(artist -> artist.getAge())).get();

        System.out.println(art);
        System.out.println(artMinAge);
    }
}
