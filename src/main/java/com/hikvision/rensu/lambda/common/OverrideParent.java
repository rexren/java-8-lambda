package com.hikvision.rensu.lambda.common;

/**
 * Created by rensu on 17/3/19.
 */
public class OverrideParent extends ParentImp {

    @Override
    public void welcome() {
        message("Class Parent: Hi!");
    }
}
