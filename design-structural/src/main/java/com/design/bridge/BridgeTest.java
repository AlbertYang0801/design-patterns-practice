package com.design.bridge;

import com.design.bridge.driver.DriverBmw;
import com.design.bridge.sing.SingBallad;
import com.design.bridge.sing.SingRocker;

/**
 * 桥接模式
 * 当一个类有两个可以扩展的行为的时候。
 * 可以将其中一个行为剥离，以组合方式集成在一起
 * @author yangjunwei
 * @date 2024/8/22
 */
public class BridgeTest {

    /**
     * 开车唱歌
     *
     * @param args
     */
    public static void main(String[] args) {
        //将sing行为支持可扩展，同时Driver行为也可扩展
        new DriverBmw("BMW",new SingRocker()).driver();
        new DriverBmw("TESLA",new SingBallad()).driver();
    }


}
