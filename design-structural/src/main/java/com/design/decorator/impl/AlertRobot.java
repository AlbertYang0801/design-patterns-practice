package com.design.decorator.impl;

import com.design.decorator.Robot;

/**
 * @author yjw
 * @date 2022/7/27 21:51
 */
public class AlertRobot implements Robot {

    @Override
    public void name() {
        System.out.println("这是告警机器人");
    }

    @Override
    public void work() {
        System.out.println("可以发出告警");
    }


}
