package com.hikvision.rensu.lambda.chapter5;

import com.hikvision.rensu.lambda.common.Album;
import com.hikvision.rensu.lambda.common.Artist;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by rensu on 17/3/19.
 */
public class Excercise {

    private final int N = 20;

    public static void main(String[] args) {
        Stream.generate(Math::random).limit(20).distinct().sorted().forEach(System.out::println);
        Stream.iterate(1, item -> item + 1).limit(10).forEach(System.out::println);
        int a[] = IntStream.range(0, 1_000_000).filter(p -> p % 2 == 0).toArray();
    }

//    public Map<Integer, Double> parallelDiceRolls() {
//        double fraction = 1.0 / N;
//        return IntStream.range(0,N)
//                .parallel()
//                .mapToObj(twoDiceThrows())
//                .collect(groupingBy)
//    }

    public Optional<Artist> biggestGroup(Stream<Artist> artists){
        Function<Artist, Long> getCount = artist -> artist.getMembers().count();
        return artists.collect(Collectors.maxBy(Comparator.comparing(getCount)));
    }

//    public static Map<Artist, List<String>> nameOfAlbumsDumb(Stream<Album> albums){
//        return albums.collect(Collectors.groupingBy(Album::getMusicians, Collectors.mapping(Album::getName, Collectors.toList())));
//    }
}
