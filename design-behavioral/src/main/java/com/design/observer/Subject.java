package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yjw
 * @date 2022/7/28 23:23
 */
public class Subject {

    /**
     * 观察者列表
     */
    private final List<Observer> observerList=new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //更改状态时，通知所有观察者
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        observerList.forEach(Observer::update);
    }



}
