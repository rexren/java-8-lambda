package com.com.hikvision.rensu.lambda.common;

/**
 * Created by rensu on 17/3/19.
 */
public interface Parent {

    public void message(String body);

    public default void welcome() {
        message("Parent: Hi!");
    }

    public String getLastMessage();
}
