package com.design.memento;

import com.design.memento.code.CareTaker;
import com.design.memento.code.Originator;
import org.mockito.internal.matchers.Or;

/**
 * 备忘录模式
 * @author yangjunwei
 * @date 2024/8/30
 */
public class MementoTest {

    public static void main(String[] args) {
        //原始对象
        Originator originator = new Originator();
        //保存备忘录的类
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1#");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State 2#");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State 3#");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }


}
