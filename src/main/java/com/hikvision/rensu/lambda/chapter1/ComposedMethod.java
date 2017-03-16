package com.hikvision.rensu.lambda.chapter1;

import com.com.hikvision.rensu.lambda.common.Album;
import com.com.hikvision.rensu.lambda.common.Artist;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rensu on 17/3/11.
 */
public class ComposedMethod {

    public static void main(String[] args) {
        //Album album = new Album();
        //album.add(new Artist("rensu", "beijing"));
    }

    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = albums.stream()
                .flatMap(album -> album.getTrackList().stream())
                .filter(track -> track.getLength() > 60)
                .map(track -> track.getName())
                .collect(Collectors.toSet());

        return trackNames;
    }

    public int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (a, b) -> a + b);
    }

    public Set<String> nameAndNatinality(List<Artist> artists){
//        return  Stream.of(artists.stream().map(artist1 -> artist1.getName()), artists.stream().map(artist -> artist.getNationality()))
//                .collect(Collectors.toSet());
        return null;
    }
}
