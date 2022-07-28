package com.design.observer.impl;

import com.design.observer.Observer;
import com.design.observer.Subject;

/**
 * @author yjw
 * @date 2022/7/28 23:33
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary Info:"+Integer.toBinaryString(subject.getState()).toLowerCase());
    }
}
