package com.hikvision.rensu.lambda.common;

/**
 * Created by rensu on 17/3/19.
 */
public interface Child extends Parent {
    @Override
    public default void welcome(){
        message("Child: Hi!");
    }
}
