package com.hikvision.rensu.lambda.chapter1;

import com.com.hikvision.rensu.lambda.common.Track;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rensu on 17/3/12.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
                new Track("Violaets for Your Furs", 378),
                new Track("Time was", 451));

        Track shortestTrak = tracks.stream().min(Comparator.comparing(Track::getLength)).get();
        Track shortestTrak2 = tracks.stream().min(Comparator.comparing(track -> track.getLength())).get();
        Track shortestTrak3 = tracks.stream().min((t1, t2) -> Long.compare(t1.getLength(), t2.getLength())).get();

        System.out.println("The shortest track is " + shortestTrak.getName());
        System.out.println("The shortest track is " + shortestTrak2.getName());
        System.out.println("The shortest track(stream Long compare) is " + shortestTrak3.getName());
    }

    static public Track findShortestTrak(List<Track> tracks) {
        return tracks.stream().min(Comparator.comparing(Track::getLength)).get();
    }
}
