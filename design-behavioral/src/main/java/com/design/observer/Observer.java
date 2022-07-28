package com.design.observer;

/**
 * @author yjw
 * @date 2022/7/28 23:23
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
