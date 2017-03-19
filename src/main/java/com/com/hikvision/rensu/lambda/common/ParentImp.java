package com.com.hikvision.rensu.lambda.common;

/**
 * Created by rensu on 17/3/19.
 */
public class ParentImp implements Parent {
    private String lastMessage;

    @Override
    public void message(String body) {
        lastMessage = body;
    }

    @Override
    public String getLastMessage() {
        return lastMessage;
    }
}
