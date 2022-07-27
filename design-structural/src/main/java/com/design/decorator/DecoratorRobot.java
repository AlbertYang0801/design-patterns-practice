package com.design.decorator;

/**
 * @author yjw
 * @date 2022/7/27 21:54
 */
public abstract class DecoratorRobot implements Robot {

    protected Robot decoratorRobot;

    public DecoratorRobot(Robot decoratorRobot) {
        this.decoratorRobot = decoratorRobot;
    }

    @Override
    public void name() {
        decoratorRobot.name();
    }

    @Override
    public void work() {
        decoratorRobot.work();
    }

}
