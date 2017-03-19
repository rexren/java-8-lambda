package com.hikvision.rensu.lambda.common;

/**
 * Created by rensu on 17/3/11.
 */
public class Track {

    private long length;

    private String name;

    public Track(String name, long length) {
        this.length = length;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    /**
     * deep copy
     * @return
     */
    public Track copy() {
        return new Track(name, length);
    }

    @Override
    public String toString() {
        return "Track{" +
                "length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
