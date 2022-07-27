package com.design.template.impl;

import com.design.template.AbstractRoom;

/**
 * @author yjw
 * @date 2022/7/27 21:13
 */
public class LowerRoom extends AbstractRoom {
    @Override
    public Integer chooseRoomType(int roomType) {
        System.out.println("房费固定50");
        return 50;
    }

    @Override
    public void payment(int money) {
        System.out.println("支付：" + money);
    }


}
