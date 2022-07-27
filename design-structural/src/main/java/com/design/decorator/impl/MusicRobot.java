package com.design.decorator.impl;

import com.design.decorator.Robot;

/**
 * @author yjw
 * @date 2022/7/27 21:53
 */
public class MusicRobot implements Robot {
    @Override
    public void name() {
        System.out.println("这是音乐机器人");
    }

    @Override
    public void work() {
        System.out.println("可以放歌听");
    }
}
