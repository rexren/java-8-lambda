package com.com.hikvision.rensu.lambda.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rensu on 17/3/11.
 */
public class Album {

    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;

    public Album(String name, List<Track> tracks, List<Artist> musicians) {
        Objects.requireNonNull(tracks, "The tracks can not be null");
        Objects.requireNonNull(musicians, "the musicians can not be null");
        this.name = name;
        this.tracks = new ArrayList<>(tracks);
        this.musicians = new ArrayList<>(musicians);
    }

    public String getName() {
        return name;
    }

    public Stream getTracks() {
        return tracks.stream();
    }

    public List<Track> getTrackList() {
        return Collections.unmodifiableList(tracks);
    }

    public Stream<Artist> getMusicians() {
        return musicians.stream();
    }

    public List getMusicanList() {
        return Collections.unmodifiableList(musicians);
    }

    public Album copy() {
        List tracks = this.tracks.stream().map(track -> track.copy()).collect(Collectors.toList());
        List musicians = this.musicians.stream().map(artist -> artist.copy()).collect(Collectors.toList());

        return new Album(name, tracks, musicians);
    }
}