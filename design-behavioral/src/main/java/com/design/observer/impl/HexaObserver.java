package com.design.observer.impl;

import com.design.observer.Observer;
import com.design.observer.Subject;

/**
 * @author yjw
 * @date 2022/7/28 23:35
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Hexa Info:"+Integer.toHexString(subject.getState()).toLowerCase());
    }
}
