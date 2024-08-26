package com.design.state.impl;

import com.design.state.State;

/**
 * @author yangjunwei
 * @date 2024/8/22
 */
public class StopState implements State {
    @Override
    public void action() {
        System.out.println("结束状态");
    }
}
