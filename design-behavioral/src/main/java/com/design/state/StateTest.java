package com.design.state;

import com.design.state.impl.RunningState;
import com.design.state.impl.StartState;
import com.design.state.impl.StopState;

/**
 * 状态模式
 * 允许对象在内部状态改变时改变行为
 * 内部不需要写大量的if-else判断状态，而是根据状态执行对应的行为即可
 * @author yangjunwei
 * @date 2024/8/22
 */
public class StateTest {

    public static void main(String[] args) {
        StateHandler stateHandler = new StateHandler();
        //处理不同状态
        stateHandler.handler(new StartState());
        stateHandler.handler(new RunningState());
        stateHandler.handler(new StopState());
    }


}
