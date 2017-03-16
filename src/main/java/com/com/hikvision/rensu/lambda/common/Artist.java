package com.com.hikvision.rensu.lambda.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by rensu on 17/3/10.
 */
public class Artist {


    /**
     * the name of artist
     */
    private String name;

    /**
     * the members of artist
     */
    private List<Artist> members;

    /**
     * where are the artist from
     */
    private String nationality;

    private int age;

    public Artist(String name, String nationality) {
        this(name, Collections.emptyList(), nationality);
    }

    public Artist(String name, List<Artist> members, String nationality) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(members);
        Objects.requireNonNull(nationality);
        this.name = name;
        this.members = new ArrayList<>(members);
        this.nationality = nationality;
    }

    public Artist(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {

        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isSolo() {
        return members.isEmpty();
    }

    public boolean isFrom(String location) {
        return location.equals(nationality);
    }

    private Stream<Artist> getMembers() {
        return members.stream();
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", from='" + nationality + '\'' +
                '}';
    }

    public Artist copy() {
        List<Artist> members = getMembers().map(Artist::copy).collect(toList());

        return new Artist(name, members, nationality);
    }
}
