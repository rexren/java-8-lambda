package com.com.hikvision.rensu.lambda.common;

import com.com.hikvision.rensu.lambda.common.Parent;

/**
 * Created by rensu on 17/3/19.
 */
public interface Child extends Parent {
    @Override
    public default void welcome(){
        message("Child: Hi!");
    }
}
