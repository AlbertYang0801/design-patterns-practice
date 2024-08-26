package com.design.state;

/**
 * @author yangjunwei
 * @date 2024/8/22
 */
public class StateHandler {

    /**
     * 处理状态
     * @param state
     */
    public void handler(State state) {
        state.action();
    }


}
