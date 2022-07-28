package com.design.observer.impl;

import com.design.observer.Observer;
import com.design.observer.Subject;

/**
 * @author yjw
 * @date 2022/7/28 23:29
 */
public class OctalObserver extends Observer {

    /**
     * @param subject 观察对象
     */
    public OctalObserver(Subject subject){
        this.subject=subject;
        //添加到被观察对象的观察者列表中
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal Info:"+Integer.toOctalString(subject.getState()).toLowerCase());
    }
}
