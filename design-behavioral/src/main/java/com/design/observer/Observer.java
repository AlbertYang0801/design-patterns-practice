package com.design.observer;

/**
 * @author yjw
 * @date 2022/7/28 23:23
 */
public abstract class Observer {

    public Subject subject;

    /**
     * 观察者们根据被观察者的状态做出相应的变化
     */
    public abstract void update();

}
