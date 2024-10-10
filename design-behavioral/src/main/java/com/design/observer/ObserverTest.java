package com.design.observer;

import com.design.observer.observer.BinaryObserver;
import com.design.observer.observer.HexaObserver;
import com.design.observer.observer.OctalObserver;

/**
 * 观察者模式
 *
 * @author yjw
 * @date 2022/7/28 23:35
 */
public class ObserverTest {

    public static void main(String[] args) {
        //被观察者
        Subject subject = new Subject();

        //观察者
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("-----------------2--------------------");
        subject.setState(2);

        System.out.println("-----------------10------------------");
        subject.setState(10);
    }


}
